package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014758.
 * @author Sean A. Irvine
 */
public class A014758 extends A014470 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
