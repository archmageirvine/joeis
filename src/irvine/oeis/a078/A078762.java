package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078762 Numbers n such that n + sigma(n) is prime.
 * @author Sean A. Irvine
 */
public class A078762 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).add(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

