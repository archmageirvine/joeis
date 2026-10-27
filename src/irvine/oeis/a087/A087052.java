package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087052 Lunar triangular numbers: 0+1+2+3+...+n, where + is lunar addition.
 * @author Sean A. Irvine
 */
public class A087052 extends Sequence0 {

  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = A087061.lunarAdd(mSum, Z.valueOf(++mN));
    return mSum;
  }
}
