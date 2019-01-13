package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014762.
 * @author Sean A. Irvine
 */
public class A014762 extends A014476 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
