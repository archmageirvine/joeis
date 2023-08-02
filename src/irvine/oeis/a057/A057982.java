package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a046.A046747;

/**
 * A057982 Number of singular n X n (-1,1)-matrices.
 * @author Sean A. Irvine
 */
public class A057982 extends A046747 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().shiftLeft(2L * mN + 1);
  }
}
