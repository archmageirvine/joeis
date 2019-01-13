package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014794.
 * @author Sean A. Irvine
 */
public class A014794 extends A014642 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
