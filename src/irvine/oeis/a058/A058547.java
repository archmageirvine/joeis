package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058547 Lexicographical-support sequence T(n,k), n,k nonnegative: total number of checks required by a "lexicographical" algorithm to find out which rows and columns of each of the n by k zero-one matrices are nonzero.
 * @author Sean A. Irvine
 */
public class A058547 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (n == 0 || m == 0) {
      return Z.ZERO;
    }
    final Z t = Z.ONE.shiftLeft((long) n * m);
    Q sum = Q.ZERO;
    for (int k = 2; k <= m; ++k) {
      sum = sum.add(Q.ONE.subtract(new Q(Z.ONE.shiftLeft(k)).reciprocal()).pow(n));
    }
    sum = sum.multiply(2);
    return sum.add(new Q(1 - m).multiply(Q.TWO.pow(1 - n))).add(Q.TWO.subtract(Q.TWO.pow(1 - m)).multiply(n)).multiply(t).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

/*
T(0, k) = 0, T(n, 0) = 0, T(n, k) = 2^(n k)( n(2 - 2^(1-k)) + (1-k)2^(1-n) + 2 Sum^k_{c=2} (1-2^(-c))^(n))
 */
