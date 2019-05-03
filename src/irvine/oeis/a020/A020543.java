package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020543 <code>a(0) = 1, a(1) = 1, a(n+1) = (n+1)*a(n) +</code> n.
 * @author Sean A. Irvine
 */
public class A020543 implements Sequence {

  private long mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.subtract(1);
  }
}
