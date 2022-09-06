package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058928 Denominators of series related to triangular cacti.
 * @author Sean A. Irvine
 */
public class A058928 implements Sequence {

  private int mN = -1;
  private Z mDen = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mDen = mDen.multiply(2L * mN);
    }
    return new Q(Z.valueOf(2L * mN + 1).pow(mN - 1), mDen).den();
  }
}
