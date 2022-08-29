package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058831 Number of labeled n-node 4-valent graphs containing two nonadjacent double edges.
 * @author Sean A. Irvine
 */
public class A058831 extends A058830 {

  @Override
  public Z next() {
    step();
    return mC.get(mN);
  }
}
