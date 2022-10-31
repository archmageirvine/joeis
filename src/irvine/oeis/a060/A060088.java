package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060088 Palindromic squares with an asymmetric square root.
 * @author Sean A. Irvine
 */
public class A060088 extends A060087 {

  {
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
