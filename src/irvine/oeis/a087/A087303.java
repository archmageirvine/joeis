package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087303 Smallest nontrivial multiple of n whose digit sum is the same as that of the digit sum of n. By nontrivial one means a(n) is not equal to n or (10^k)*n. 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087303 extends Sequence2 {

  private long mN = 1;
  private long mMul = 10;

  private boolean is(long t, final long s) {
    if (Functions.DIGIT_SUM.l(t) != s) {
      return false;
    }
    while (t % 10 == 0) {
      t /= 10;
      if (t == mN) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == mMul) {
      mMul *= 10;
      return Z.ZERO;
    }
    final long s = Functions.DIGIT_SUM.l(mN);
    long t = 2 * mN;
    while (!is(t, s)) {
      t += mN;
    }
    return Z.valueOf(t);
  }
}
