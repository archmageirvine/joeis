package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014900.
 * @author Sean A. Irvine
 */
public class A014900 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(17).add(mN);
    }
    return mA;
  }
}
