package irvine.oeis.a056;

import java.util.ArrayList;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056885 Triangle T(n,k) = number of minimal covers of an unlabeled n-set that cover k points of that set uniquely, k=0..n.
 * @author Sean A. Irvine
 */
public class A056885 extends MemoryFunction2<Integer, Polynomial<Q>> implements Sequence {

  // After Vladeta Jovovic, https://oeis.org/A056885/a056885.pdf

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  private Polynomial<Q> c(final int j, final int[] k) {
    final int m = k.length - 1;
    int e = 0;
    for (int i = 1; i <= m; ++i) {
      e += IntegerUtils.gcd(j, i) * k[i];
    }
    long s = 0;
    for (int i = 1; i <= Math.min(j, k.length - 1); ++i) {
      if (j % i == 0) {
        s += (long) i * k[i];
      }
    }
    final Z t = Z.ONE.shiftLeft(e).subtract(s);
    final Polynomial<Q> res = RING.empty();
    res.add(new Q(t));
    for (int i = 1; i < j; ++i) {
      res.add(Q.ZERO);
    }
    res.add(new Q(s));
    return res;
  }

  @Override
  protected Polynomial<Q> compute(final Integer m, final Integer n) {
    if (n == 0 || m == 0) {
      return RING.one();
    }
    Polynomial<Q> res = RING.zero();
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    final IntegerPartition part = new IntegerPartition(m);
    int[] p;
    int[] k = new int[m + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, k);
      final ArrayList<Polynomial<Q>> c = new ArrayList<>();
      for (int j = 1; j <= n; ++j) {
        c.add(c(j, k));
      }
      res = RING.add(res, RING.multiply(zn.apply(c, Z.valueOf(n)), new Q(Z.ONE, SymmetricGroup.per(k))));
    }
    return res;
  }

  private Polynomial<Q> bbar(final int m, final int n) {
    return n == 0 ? get(m, n) : RING.subtract(get(m, n), get(m, n - 1));
  }

  private Z a(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      sum = sum.add(bbar(j, n - j).coeff(k - j).toZ());
    }
    return sum;
  }


  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return a(mN, mM);
  }
}
