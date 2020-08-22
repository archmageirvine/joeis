package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a022.A022300;

/**
 * A025513 Exactly half of first a(n) terms of A022300 are 1's (not known to be infinite).
 * @author Sean A. Irvine
 */
public class A025513 extends A022300 {

  private long mRunningDelta = 0;
  private long mM = 0;

  @Override
  public Z next() {
    do {
      mRunningDelta += super.next().longValue() * 2 - 3;
      ++mM;
    } while (mRunningDelta != 0);
    return Z.valueOf(mM);
  }
}
