package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383270 Length of the longest sequence of contiguous 1s in the binary expansion of n after flipping at most one 0-bit to 1.
 * @author Sean A. Irvine
 */
public class A383270 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long bc = Long.bitCount(mN);
    if (bc == Functions.DIGIT_LENGTH.i(2, mN)) {
      return Z.valueOf(bc);
    }
    long c = 0;
    long p = 0;
    long m = 0;
    long n = mN;
    while (n != 0) {
      if ((n & 1) == 1) {
        ++c;
      } else {
        p = (n & 2) > 0 ? c : 0;
        c = 0;
      }
      final long pc = p + c;
      if (pc > m) {
        m = pc;
      }
      n >>>= 1;
    }
    return Z.valueOf(m + 1);
  }
}
