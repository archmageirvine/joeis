package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032031 Triple factorial numbers: (3n)!!! = 3^n*n!.
 * @author Sean A. Irvine
 */
public class A032031 implements Sequence {

  private long mN = -3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 3;
    if (mN > 0) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
