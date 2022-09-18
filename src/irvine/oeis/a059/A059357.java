package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a008.A008298;

/**
 * A059357 A diagonal of triangle in A008298.
 * @author Sean A. Irvine
 */
public class A059357 extends A008298 {

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN).get(3);
  }
}
