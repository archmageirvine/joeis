package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063456 Integers of the form (9^k + 7^k + 5^k + 3^k) / k.
 * @author Sean A. Irvine
 */
public class A063456 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.ONE;
  private Z mD = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(9);
      mB = mB.multiply(7);
      mC = mC.multiply(5);
      mD = mD.multiply(3);
      final Z t = mA.add(mB).add(mC).add(mD);
      if (t.mod(mN) == 0) {
        return t.divide(mN);
      }
    }
  }
}
