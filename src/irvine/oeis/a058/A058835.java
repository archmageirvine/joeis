package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058835 Number of labeled n-node 4-valent graphs containing a triple edge and a double edge.
 * @author Sean A. Irvine
 */
public class A058835 extends A058830 {

  @Override
  public Z next() {
    step();
    return mG.get(mN);
  }
}
