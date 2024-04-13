package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063738 Numbers n such that sum of digits of n is equal to the product of the digits of the sum of the prime factors of n, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A063738 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_PRODUCT.z(Jaguar.factor(++mN).sopfr()).equals(Z.valueOf(Functions.DIGIT_SUM.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
