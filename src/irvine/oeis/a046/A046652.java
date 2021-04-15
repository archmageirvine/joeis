package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a091.A091665;

/**
 * A046652 Triangle of rooted planar maps, read by rows.
 * @author Sean A. Irvine
 */
public class A046652 extends A091665 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return t(mN, mM);
  }
}
