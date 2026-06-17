package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a050.A050292;

/**
 * A394865 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A394865 extends Sequence1 {

  private final Sequence mT = new A050292().skip();
  private final Sequence mS = new A050292();
  private Z mA = mS.next();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 3) {
      mA = mS.next();
      mN = 0;
    }
    return mT.next().subtract(mA);
  }
}
