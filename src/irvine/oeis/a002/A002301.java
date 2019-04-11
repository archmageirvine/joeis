package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002301 <code>a(n) = n! / 3</code>.
 * @author Sean A. Irvine
 */
public class A002301 implements Sequence {

  private Z mF = Z.TWO;
  private long mN = 2;

  @Override
  public Z next() {
    if (++mN > 3) {
      mF = mF.multiply(mN);
    }
    return mF;
  }
}
