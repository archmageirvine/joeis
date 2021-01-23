package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000217 Triangular numbers: a(n) = binomial(n+1,2) = n(n+1)/2 = 0 + 1 + 2 + ... + n.
 * @author Sean A. Irvine
 */
public class A000217 implements Sequence {

  protected long mN = -1;

  /**
   * Return the nth triangular number.
   * @param n index
   * @return triangular number
   */
  public static Z triangular(final long n) {
    return Z.valueOf(n).multiply(n + 1).divide2();
  }

  @Override
  public Z next() {
    return triangular(++mN);
  }
}

