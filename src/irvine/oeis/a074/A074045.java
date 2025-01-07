package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a244.A244925;

/**
 * A074045 Number of rooted trees of 2n+1 nodes with every leaf at height n.
 * @author Sean A. Irvine
 */
public class A074045 extends A244925 {

  private long mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN);
  }
}
