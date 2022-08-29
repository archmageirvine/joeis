package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058832 Number of labeled n-node 4-valent graphs containing two adjacent double edges.
 * @author Sean A. Irvine
 */
public class A058832 extends A058830 {

  @Override
  public Z next() {
    step();
    return mD.get(mN);
  }
}
