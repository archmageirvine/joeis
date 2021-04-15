package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A046646 Number of certain rooted planar maps.
 * @author Sean A. Irvine
 */
public class A046646 extends A001764 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    }
    return super.next().multiply2();
  }
}
