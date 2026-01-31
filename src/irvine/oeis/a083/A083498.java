package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083498 a(n)= smallest multiple of n greater than n which has no digit in common with a(n-1).
 * @author Sean A. Irvine
 */
public class A083498 extends Sequence1 {

  private long mPrev = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 129) {
      return null;
    }
    final int syn = Functions.SYNDROME.i(mPrev);
    long k = ++mN;
    while (true) {
      k += mN;
      if ((Functions.SYNDROME.i(k) & syn) == 0) {
        mPrev = k;
        return Z.valueOf(k);
      }
    }
  }
}
