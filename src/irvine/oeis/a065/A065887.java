package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065887 Smallest number whose square is divisible by n!.
 * @author Sean A. Irvine
 */
public class A065887 extends A065886 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
