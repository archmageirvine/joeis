package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066719 Numbers k such that 1 + k^phi(k) is prime.
 * @author Sean A. Irvine
 */
public class A066719 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      mN += 2;
      if (Z.valueOf(mN).pow(Functions.PHI.z(mN)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
