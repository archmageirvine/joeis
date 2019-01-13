package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a121.A121355;

/**
 * A005133.
 * @author Sean A. Irvine
 */
public class A005133 extends A121355 {

  @Override
  public Z next() {
    return super.next().divide(mF.divide(mN));
  }
}
