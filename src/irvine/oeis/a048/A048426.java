package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048426 Numbers k such that k^2 is composed of three 1-digit-overlapping subsquares.
 * @author Sean A. Irvine
 */
public class A048426 extends A048425 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
