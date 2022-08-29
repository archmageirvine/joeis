package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058834 Number of labeled n-node 4-valent graphs containing a triple edge.
 * @author Sean A. Irvine
 */
public class A058834 extends A058830 {

  @Override
  public Z next() {
    step();
    return mF.get(mN);
  }
}
