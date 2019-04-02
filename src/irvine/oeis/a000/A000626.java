package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000626 Number of stereoisomeric paraffins with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000626 extends A000627 {

  private final A000628 mA = new A000628();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}
