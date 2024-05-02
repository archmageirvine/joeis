package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039777 Integers n such that phi(n) is equal to the sum of (the product of prime factors) and (the product of exponents) of n-1.
 * @author Sean A. Irvine
 */
public class A039777 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(mN);
      final Z phi = Functions.PHI.z(++mN);
      Z p1 = Z.ONE;
      Z p2 = Z.ONE;
      for (final Z p : fs.toZArray()) {
        p1 = p1.multiply(p);
        p2 = p2.multiply(fs.getExponent(p));
      }
      if (mN == 2 || p1.add(p2).equals(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
