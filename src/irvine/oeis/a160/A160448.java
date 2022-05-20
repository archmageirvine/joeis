package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160448 Number of isomorphism classes of n-fold coverings of a connected graph with Betti number 6.
 * @author Sean A. Irvine
 */
public class A160448 extends A160449 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}
