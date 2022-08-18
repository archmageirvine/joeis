package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a342.A342053;

/**
 * A341925 Number of 3-connected triangulations of a pentagon up to orientation-preserving isomorphisms with n interior nodes.
 * @author Sean A. Irvine
 */
public class A341925 extends A342053 {

  private int mN = 0;

  @Override
  public Z next() {
    return a341923ColSeq(++mN, 5).coeff(mN);
  }
}
