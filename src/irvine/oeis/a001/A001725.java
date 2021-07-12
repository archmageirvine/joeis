package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001725 a(n) = n!/5!.
 * @author Sean A. Irvine
 */
public class A001725 implements Sequence {

  private long mN = 4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(mN);
    }
    return mA;
  }

}
