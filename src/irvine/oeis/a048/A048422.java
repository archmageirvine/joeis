package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048422 Numbers k such that k^2 is formed from two subsquares that overlap in a single digit.
 * @author Sean A. Irvine
 */
public class A048422 extends A048421 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
