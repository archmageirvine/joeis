package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048428 a(n)^2 is a square composed of three '2 digit' overlapping subsquares.
 * @author Sean A. Irvine
 */
public class A048428 extends A048427 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
