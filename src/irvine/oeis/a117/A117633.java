package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a006.A006744;

/**
 * A117633 Number of self-avoiding walks of n steps on a Manhattan square lattice.
 * @author Sean A. Irvine
 */
public class A117633 extends A006744 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}
