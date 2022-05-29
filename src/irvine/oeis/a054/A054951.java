package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import irvine.math.IntegerUtils;
import irvine.math.api.Field;
import irvine.math.graph.Edges;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054951 Number of unlabeled semi-strong digraphs on n nodes with mutually nonisomorphic components.
 * @author Sean A. Irvine
 */
public class A054951 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  protected List<List<Z>> graphCycleIndexData(final int n, final Edges edgeFunc, final Function<Integer, Z> yf) {
    final List<List<Z>> results = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      final List<Z> v = new ArrayList<>();
      final IntegerPartition part = new IntegerPartition(k);
      int[] p;
      while ((p = part.next()) != null) {
        v.add(IntegerPartition.permCount(p).multiply(edgeFunc.edges(p, yf)));
      }
      results.add(v);
    }
    return results;
  }

  protected <E> List<List<E>> invGgfCiData(final List<List<Z>> blocks, final Field<E> fld, final Function<Integer, E> yf) {
    final List<List<E>> results = new ArrayList<>();
    results.add(Collections.singletonList(fld.one()));
    for (int n = 1; n < blocks.size(); ++n) {
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      final List<E> v = new ArrayList<>();
      for (int i = 1; i <= n; ++i) {
        final int j = n - i;
        final List<E> uj = results.get(j);
        final List<Z> ui = blocks.get(i);
        final E b = fld.coerce(Binomial.binomial(n, i));
        int xj = -1;
        final IntegerPartition partj = new IntegerPartition(j);
        int[] pj;
        while ((pj = partj.next()) != null) {
          final List<E> q = new ArrayList<>();
          q.add(null); // 0 unused
          ++xj;
          for (int s = 1; s <= i; ++s) {
            E qs = fld.one();
            for (final int k : pj) {
              final int g = IntegerUtils.gcd(s, k);
              qs = fld.multiply(qs, fld.pow(yf.apply(s * k / g), g));
            }
            q.add(qs);
          }
          int xi = -1;
          final IntegerPartition parti = new IntegerPartition(i);
          int[] pi;
          while ((pi = parti.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(IntegerPartition.merge(pi, pj)));
            E pr = fld.one();
            for (final int k : pi) {
              pr = fld.multiply(pr, q.get(k));
            }
            while (col >= v.size()) {
              v.add(fld.zero());
            }
            final E w = fld.multiply(fld.multiply(uj.get(xj), b), fld.coerce(ui.get(xi)));
            v.set(col, fld.subtract(v.get(col), fld.multiply(pr, w)));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  // Helper to convert a cycle index series stored as a vector of vectors into an o.g.f. counting the unlabeled objects.
  protected Polynomial<Z> unlabeledOgf(final List<List<Z>> data) {
    final Polynomial<Z> res = RING.empty();
    Z f = Z.ONE;
    for (int n = 0; n < data.size(); f = f.multiply(++n)) {
      res.add(ZUtils.sum(data.get(n)).divide(f));
    }
    return res;
  }

  @Override
  public Z next() {
    return unlabeledOgf(invGgfCiData(graphCycleIndexData(++mN, Edges.DIGRAPH_EDGES, e -> Z.TWO), IntegerField.SINGLETON, e -> Z.TWO)).coeff(mN).negate();
  }
}
