package irvine.oeis.a003;

import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003447 Number of nonequivalent dissections of an n-gon into <code>n-3</code> polygons by nonintersecting diagonals rooted at a cell up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003447 extends A003442 {

  // Following the formulation given in the Lisonek paper.

  protected static final Q QUARTER = Q.ONE_QUARTER;

  private Polynomial<Q> r(final int i, final int n) {
    if ((i & 1) == 0) {
      return RING.zero();
    }
    return RING.add(mV.get((i + 1) / 2, (n + 1) / 2).substitutePower(2), mV.get((i - 1) / 2, (n + 1) / 2).substitutePower(2));
  }

  private Polynomial<Q> rPrime(final int l, final int n) {
    if (l == 0) {
      return RING.one();
    }
    Polynomial<Q> rPrime = RING.zero();
    final IntegerPartition part = new IntegerPartition(l);
    final int[] a = new int[l + 1];
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      int sumA = 0;
      Polynomial<Q> prod = RING.one();
      Z den = Z.ONE;
      for (int k = 1; k < a.length; ++k) {
        if (a[k] > 0) {
          sumA += a[k];
          den = den.multiply(mF.factorial(a[k]));
          prod = RING.multiply(prod, RING.pow(r(k, n), a[k], n), n);
        }
      }
      prod = RING.multiply(prod, new Q(mF.factorial(sumA), den));
      rPrime = RING.add(rPrime, prod);
    }
    return rPrime;
  }

  protected Polynomial<Q> t(final int i, final int n) {
    Polynomial<Q> sum = rPrime(i, n - 1).shift(1);
    for (int k = 1; k <= i; k += 2) {
      sum = RING.add(sum, RING.multiply(r(k, n), rPrime(i - k, n), n));
    }
    return sum;
  }

  protected Polynomial<Q> t2(final int i, final int n) {
    Polynomial<Q> sum = RING.zero();
    for (int k = 0; k <= i; ++k) {
      sum = RING.add(sum, RING.multiply(t(k, n), t(i - k, n), n));
    }
    return sum;
  }

  protected Polynomial<Q> smallF(final int i, final int n) {
    Polynomial<Q> sum = RING.zero();
    for (int k = 0; k <= i; ++k) {
      final Polynomial<Q> v2 = (k & 1) == 0 ? mV.get(k / 2, (n + 1) / 2).substitutePower(2) : RING.zero();
      final Polynomial<Q> u = RING.add(RING.add(RING.multiply(t(k, n), Q.TWO), v2), t2(k, n));
      sum = RING.add(sum, RING.multiply(u, r(i - k, n), n));
    }
    final Polynomial<Q> f = RING.multiply(f(i, n), Q.HALF);
    return RING.add(f, RING.multiply(sum, QUARTER));
  }

  protected int mN = 0;

  protected int s() {
    return mN + 3;
  }

  protected int r() {
    return mN;
  }

  @Override
  public Z next() {
    ++mN;
    return smallF(r(), s()).coeff(s()).toZ();
  }
}

