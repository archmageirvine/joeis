package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082103 Numbers n such that 3^n + 2^(n-1) is prime.
 * @author Sean A. Irvine
 */
public class A082103 extends Sequence1 {

  private Z mA = Z.THREE;
  private Z mB = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      mB = mB.multiply2();
      if (mA.add(mB).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
