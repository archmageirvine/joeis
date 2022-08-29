package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058833 Number of labeled n-node 4-valent graphs containing 3 double edges, a distinguished unordered pair of which are adjacent.
 * @author Sean A. Irvine
 */
public class A058833 extends A058830 {

  @Override
  public Z next() {
    step();
    return mE.get(mN);
  }
}
