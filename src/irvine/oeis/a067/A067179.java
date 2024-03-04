package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067179 Smallest number whose square has sum of digits A056991(n).
 * @author Sean A. Irvine
 */
public class A067179 extends A067178 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
