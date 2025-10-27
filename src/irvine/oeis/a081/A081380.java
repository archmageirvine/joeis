package irvine.oeis.a081;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081380 Numbers k such that the sets of prime factors (ignoring multiplicity) of A000203(k) = sigma(k) and of A001157(k) = sigma_2(k) are identical.
 * @author Sean A. Irvine
 */
public class A081380 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Arrays.equals(Jaguar.factor(Functions.SIGMA.z(2, ++mN)).toZArray(), Jaguar.factor(Functions.SIGMA1.z(mN)).toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}

