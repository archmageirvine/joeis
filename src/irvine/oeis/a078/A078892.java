package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078892 Numbers n such that phi(n) - 1 is prime, where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A078892 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
