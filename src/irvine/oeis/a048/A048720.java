package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048720 Multiplication table {0..i} X {0..j} of binary polynomials (polynomials over GF(2)) interpreted as binary vectors, then written in base 10; or, binary multiplication without carries.
 * @author Sean A. Irvine
 */
public class A048720 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private long multiply(final long a, final long b) {
    long sum = 0;
    for (long s = b, t = a; s != 0; s >>>= 1, t <<= 1) {
      if ((s & 1) == 1) {
        sum ^= t;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(multiply(mN - mM, mM));
  }
}
