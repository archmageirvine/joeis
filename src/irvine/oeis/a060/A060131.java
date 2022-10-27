package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060128.
 * @author Sean A. Irvine
 */
public class A060131 extends A060117 {

  private int mN = -1;

  @Override
  public Z next() {
    return permUnrank3R(++mN).order();
  }
}
