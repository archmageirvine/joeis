package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057605 Nonnegative n such that 4*n^2 + 163 is prime.
 * @author Sean A. Irvine
 */
public class A057605 extends A057604 {

  @Override
  public Z next() {
    return super.next().subtract(163).divide(4).sqrt();
  }
}
