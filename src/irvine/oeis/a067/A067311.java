package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067311 Triangle read by rows: T(n,k) gives number of ways of arranging n chords on a circle with k simple intersections (i.e., no intersections with 3 or more chords) - positive values only.
 * @author Sean A. Irvine
 */
public class A067311 extends A067310 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    final Z t = t(mN, ++mM);
    if (!t.isZero()) {
      return t;
    }
    ++mN;
    mM = 0;
    return t(mN, mM);
  }
}
