package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014720.
 * @author Sean A. Irvine
 */
public class A014720 extends A014411 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
