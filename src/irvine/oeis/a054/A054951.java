package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import irvine.math.IntegerUtils;
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

  // After Andrew Howroyd, cf. A350489

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  // todo notes these kind of functions exist multiple places
  private interface Edges {
    Z edges(final int[] partition, final Function<Integer, Z> yf);
  }

  private final Edges mDigraphEdges = (partition, yf) -> {
    Z prod = Z.ONE;
    for (int i = 1; i < partition.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = IntegerUtils.gcd(partition[i], partition[j]);
        prod = prod.multiply(yf.apply(partition[i] * partition[j] / g).pow(2L * g));
      }
    }
    for (final int j : partition) {
      prod = prod.multiply(yf.apply(j).pow(j - 1));
    }
    return prod;
  };

  private List<List<Z>> graphCycleIndexData(final int n, final Edges edgeFunc, final Function<Integer, Z> yf) {
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

  private List<List<Z>> invGgfCiData(final List<List<Z>> blocks, final Function<Integer, Z> yf) {
    final List<List<Z>> results = new ArrayList<>();
    results.add(Collections.singletonList(Z.ONE));
    for (int n = 1; n < blocks.size(); ++n) {
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      final List<Z> v = new ArrayList<>();
      for (int i = 1; i <= n; ++i) {
        final int j = n - i;
        final List<Z> uj = results.get(j);
        final List<Z> ui = blocks.get(i);
        final Z b = Binomial.binomial(n, i);
        final Z[] q = new Z[i + 1]; // indexed from 1..n
        int xj = -1;
        final IntegerPartition partj = new IntegerPartition(j);
        int[] pj;
        while ((pj = partj.next()) != null) {
          ++xj;
          for (int s = 1; s < q.length; ++s) {
            q[s] = Z.ONE;
            for (final int k : pj) {
              final int g = IntegerUtils.gcd(s, k);
              q[s] = q[s].multiply(yf.apply(s * k / g).pow(g));
            }
          }
          int xi = -1;
          final IntegerPartition parti = new IntegerPartition(i);
          int[] pi;
          while ((pi = parti.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(IntegerPartition.merge(pi, pj)));
            Z pr = Z.ONE;
            for (final int k : pi) {
              pr = pr.multiply(q[k]);
            }
            while (col >= v.size()) {
              v.add(Z.ZERO);
            }
            final Z w = uj.get(xj).multiply(b).multiply(ui.get(xi));
            v.set(col, v.get(col).subtract(pr.multiply(w)));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  // Helper to convert a cycle index series stored as a vector of vectors into an o.g.f. counting the unlabeled objects.
  private Polynomial<Z> unlabeledOgf(final List<List<Z>> data) {
    final Polynomial<Z> res = RING.empty();
    Z f = Z.ONE;
    for (int n = 0; n < data.size(); f = f.multiply(++n)) {
      res.add(ZUtils.sum(data.get(n)).divide(f));
    }
    return res;
  }

  @Override
  public Z next() {
    return unlabeledOgf(invGgfCiData(graphCycleIndexData(++mN, mDigraphEdges, e -> Z.TWO), e -> Z.TWO)).coeff(mN).negate();
  }
}
