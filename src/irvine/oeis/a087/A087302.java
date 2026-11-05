package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087302 Smallest nontrivial multiple of n whose digit sum is a multiple of digit sum of n. By nontrivial one means a(n) is not equal to n or (10^k)*n or a concatenation of n with itself.
 * @author Sean A. Irvine
 */
public class A087302 extends Sequence1 {

  private long mN = 0;
  private long mMul = 10;

  private boolean is(long t, final long s) {
    if (Functions.DIGIT_SUM.l(t) % s != 0) {
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
    }
    final long s = Functions.DIGIT_SUM.l(mN);
    final long concat = mN * mMul + mN;
    long t = 2 * mN;
    while (t == concat || !is(t, s)) {
      t += mN;
    }
    return Z.valueOf(t);
  }
}
