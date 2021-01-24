package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038588 Sizes of clusters in hexagonal lattice A_2 centered at deep hole.
 * @author Sean A. Irvine
 */
public class A038588 extends A038587 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mPrev;
    while ((mPrev = super.next()).equals(t)) {
      // do nothing
    }
    return mPrev;
  }
}
