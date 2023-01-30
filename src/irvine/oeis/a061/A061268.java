package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061268 Numbers k such that k^2 has property that the sum of its digits and the product of its digits are nonzero squares.
 * @author Sean A. Irvine
 */
public class A061268 extends A061267 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
