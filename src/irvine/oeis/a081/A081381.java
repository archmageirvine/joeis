package irvine.oeis.a081;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081381 Numbers n such that n and tau(n) = A000005(n) have the same prime factors (ignoring multiplicity).
 * @author Sean A. Irvine
 */
public class A081381 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Arrays.equals(Jaguar.factor(++mN).toZArray(), Jaguar.factor(Functions.SIGMA0.z(mN)).toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}

