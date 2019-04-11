package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002583 Largest prime factor of <code>n! + 1</code>.
 * @author Sean A. Irvine
 */
public class A002583 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return A002582.lpf(mF.add(1));
  }
}
