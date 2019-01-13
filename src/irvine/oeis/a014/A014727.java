package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014727.
 * @author Sean A. Irvine
 */
public class A014727 extends A014428 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
