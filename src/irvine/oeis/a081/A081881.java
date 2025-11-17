package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a136.A136616;

/**
 * A081881 Pack bins of size 1 sequentially with items of size 1/1, 1/2, 1/3, 1/4, ... . Sequence gives values of n for which 1/n starts a new bin.
 * @author Sean A. Irvine
 */
public class A081881 extends Sequence1 {

  private final A136616 mA = new A136616();
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
      return Z.ONE;
    }
    mN = mA.a(mN.subtract(1)).add(1);
    return mN;
  }
}
