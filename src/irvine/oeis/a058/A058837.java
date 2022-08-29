package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058837 Number of labeled n-node 4-valent graphs containing a loop and a double edge.
 * @author Sean A. Irvine
 */
public class A058837 extends A058830 {

  @Override
  public Z next() {
    step();
    return mI.get(mN);
  }
}
