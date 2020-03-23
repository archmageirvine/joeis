package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030158 Even squares in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030158 extends A030157 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
