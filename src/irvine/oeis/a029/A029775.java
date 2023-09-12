package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029775 Squares k^2 whose digits appear in k.
 * @author Sean A. Irvine
 */
public class A029775 extends A029774 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
