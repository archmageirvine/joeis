package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003634;

/**
 * A007471.
 * @author Sean A. Irvine
 */
public class A007471 extends A003634 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
