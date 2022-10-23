package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059812 Let g_n be the ball packing n-width for the manifold torus X interval; sequence gives denominator of (g_n/Pi)^2.
 * @author Sean A. Irvine
 */
public class A059812 extends Sequence1 {

  private static final long[] SMALL = {1, 4, 4, 4, 25, 25, 64, 289};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    return Z.valueOf(mN + 1);
  }
}
