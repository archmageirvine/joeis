package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066244 Numbers n such that sigma(n+2)-2sigma(n+1)+sigma(n) = n.
 * @author Sean A. Irvine
 */
public class A066244 extends Sequence1 {

  private long mN = 1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mA;
      mA = mB;
      mB = Functions.SIGMA1.z(++mN + 2);
      if (mB.subtract(mA.multiply2()).add(s).longValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
