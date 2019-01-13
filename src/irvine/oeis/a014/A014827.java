package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014827.
 * @author Sean A. Irvine
 */
public class A014827 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(5).add(mN);
    }
    return mA;
  }
}
