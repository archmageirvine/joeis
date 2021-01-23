package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001000 a(n) = least m such that if a/b &lt; c/d where a,b,c,d are integers in [0,n], then a/b &lt; k/m &lt; c/d for some integer k.
 * @author Sean A. Irvine
 */
public class A001000 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }

    final double s = Math.sqrt(mN - 1);
    final double r = mN - 2 * s + 1;
    final double y = Math.floor(r);

    final long ss = (long) s;
    if (ss * ss != mN - 1 && r - y < 0.0001) {
      throw new UnsupportedOperationException(); // loss of precision
    }

    final long z = mN - (long) y;
    final double u = 0.25 * z * z + 1;
    final double w = Math.floor(u);
    return Z.valueOf(mN).multiply((long) y).add((long) w);
  }
}
