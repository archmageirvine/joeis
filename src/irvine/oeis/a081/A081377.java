package irvine.oeis.a081;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081377 Numbers k such that the set of prime divisors of phi(k) is equal to the set of prime divisors of sigma(k).
 * @author Sean A. Irvine
 */
public class A081377 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Arrays.equals(Jaguar.factor(Functions.PHI.l(++mN)).toZArray(), Jaguar.factor(Functions.SIGMA1.z(mN)).toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}

