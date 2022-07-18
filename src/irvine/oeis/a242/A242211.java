package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.a222.A222208;

/**
 * A222208.
 * @author Sean A. Irvine
 */
public class A242211 extends A222208 {

  private long mM = 0;

  @Override
  public Z next() {
    if (mM == 0) {
      mM = 4;
    } else {
      while (mA.get(mM) == 0) {
        super.next();
      }
      mM = mA.get(mM);
    }
    return Z.valueOf(mM);
  }
}
