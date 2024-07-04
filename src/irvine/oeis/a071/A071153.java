package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a079.A079436;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071153 extends A079436 {

  @Override
  public Z next() {
    return super.next().divide(10);
  }
}
