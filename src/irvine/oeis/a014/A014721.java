package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014721.
 * @author Sean A. Irvine
 */
public class A014721 extends A014413 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
