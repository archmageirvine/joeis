package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048424 Numbers k such that the decimal expansion of k^2 consists of two squares that overlap in 2 digits.
 * @author Sean A. Irvine
 */
public class A048424 extends A048423 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
