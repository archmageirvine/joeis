package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A048342 Numbers n such that the concatenation of the numbers 1, 2, ..., n is a product of distinct primes.
 * @author Sean A. Irvine
 */
public class A048342 extends A007908 {

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(super.next());
      if (mN == 1 || fs.bigOmega() == fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
