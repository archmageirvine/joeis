package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160446 Number of isomorphism classes of n-fold coverings of a connected graph with Betti number 4.
 * @author Sean A. Irvine
 */
public class A160446 extends A160449 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
