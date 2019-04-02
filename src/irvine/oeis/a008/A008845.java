package irvine.oeis.a008;

import irvine.math.z.Z;

/**
 * A008845 Numbers k such that k+1 and k/2+1 are squares.
 * @author Sean A. Irvine
 */
public class A008845 extends A008844 {

  @Override
  public Z next() {
    return super.next().subtract(1).multiply2();
  }
}
