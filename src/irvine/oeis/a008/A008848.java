package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008848.
 * @author Sean A. Irvine
 */
public class A008848 extends A008847 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
