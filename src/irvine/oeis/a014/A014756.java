package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014756.
 * @author Sean A. Irvine
 */
public class A014756 extends A014469 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
