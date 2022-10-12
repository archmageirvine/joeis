package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059816 Let g_n be the ball packing n-width for the manifold torus X square; sequence gives denominator of (g_n/Pi)^2.
 * @author Sean A. Irvine
 */
public class A059816 implements Sequence {

  private static final long[] SMALL = {1, 1, 9, 9, 25, 49, 225};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    return Z.valueOf((mN & 1) == 0 ? mN + 1 : (mN + 1) / 2);
  }
}
