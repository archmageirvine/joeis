package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063454 Number of solutions to x^3 + y^3 = z^3 mod n.
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
