package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086742 Start with a(0)=1, then k-th run is 1,2,3,..., a(0) + a(1) + a(2) + ... + a(k-1).
 * @author Sean A. Irvine
 */
public class A086742 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;
  private long mSum = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (mSum == 0) {
        mSum = 1;
        mM = 0;
        return Z.ONE;
      }
      mN = mSum;
      mM = 1;
    }
    mSum += mM;
    return Z.valueOf(mM);
  }
}
