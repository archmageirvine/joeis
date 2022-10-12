package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059815 Let g_n be the ball packing n-width for the manifold torus X square; sequence gives numerator of (g_n/Pi)^2.
 * @author Sean A. Irvine
 */
public class A059815 implements Sequence {

  private static final long[] SMALL = {1, 1, 4, 4, 9, 16, 64};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    return (mN & 1) == 0 ? Z.TWO : Z.ONE;
  }
}
