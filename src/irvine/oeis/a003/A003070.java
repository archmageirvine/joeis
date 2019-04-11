package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003070 <code>a(n) =</code> ceiling(log_2 <code>n!)</code>.
 * @author Sean A. Irvine
 */
public class A003070 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    return Z.valueOf(mF.bitLength() - (mN <= 2 ? 1 : 0));
  }
}
