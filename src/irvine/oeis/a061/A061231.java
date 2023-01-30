package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A061231 n - the reversal of n is a nonzero square.
 * @author Sean A. Irvine
 */
public class A061231 extends Sequence0 {

  // Offset should be 1 in the OEIS!

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z d = mN.subtract(ZUtils.reverse(mN));
      if (d.signum() > 0 && d.isSquare()) {
        return mN;
      }
    }
  }
}
