package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000680 a(n) = (2n)!/2^n.
 * @author Sean A. Irvine
 */
public class A000680 implements Sequence {

  private int mN = 0;
  private Z mF = null;

  @Override
  public Z next() {
    if (mF == null) {
      mF = Z.ONE;
    } else {
      mF = mF.multiply(++mN * ++mN).divide2();
    }
    return mF;
  }
}
