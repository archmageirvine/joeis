package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a007.A007678;

/**
 * A006533 Place n equally-spaced points around a circle and join every pair of points by a chord; this divides the circle into a(n) regions.
 * @author Sean A. Irvine
 */
public class A006533 extends A007678 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
