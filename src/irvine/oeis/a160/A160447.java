package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160447 Number of isomorphism classes of n-fold coverings of a connected graph with Betti number 5.
 * @author Sean A. Irvine
 */
public class A160447 extends A160449 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
