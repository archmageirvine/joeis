package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A083362 Square table, read by antidiagonals, of least distinct positive integers such that the sum of <code>any</code> two consecutive terms in <code>any</code> row is a square number.
 * @author Sean A. Irvine
 */
public class A083362 implements Sequence {

  /**
   * Direct computation of numbers in this sequence.
   * @param n row
   * @param k column
   * @return value
   */
  public static Z t(final long n, final long k) {
    if (n == 1) {
      return Z.valueOf(k).multiply(k + 1).divide2();
    }
    final long r = (n & ~1) - 1;
    final Z v = Z.valueOf(r + k).multiply(r + k + 1);
    return Z.valueOf(r + 1).multiply(r + 2).signedAdd((k & 1) == 0, v).divide2().subtract(Z.valueOf(n).square().divide2()).abs();
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }

}

