package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072145.
 * @author Sean A. Irvine
 */
public class A072166 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    while (++mT % mN != 1) {
      // do nothing
    }
    return Z.valueOf(mT);
  }
}
