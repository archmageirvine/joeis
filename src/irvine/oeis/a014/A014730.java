package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014730.
 * @author Sean A. Irvine
 */
public class A014730 extends A014447 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
