package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058836 Number of labeled n-node 4-valent graphs containing a loop.
 * @author Sean A. Irvine
 */
public class A058836 extends A058830 {

  @Override
  public Z next() {
    step();
    return mH.get(mN);
  }
}
