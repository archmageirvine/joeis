package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064656 Length of n-th run of odd numbers in A064413.
 * @author Sean A. Irvine
 */
public class A064656 extends A064654 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}
