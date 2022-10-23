package irvine.oeis.a016;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A016837 Primes reached after k iterations of sum of n and its prime divisors = t (where t replaces n in each iteration).
 * @author Sean A. Irvine
 */
public class A016837 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    do {
      final FactorSequence fs = Jaguar.factor(m);
      for (final Z p : fs.toZArray()) {
        m = m.add(p.multiply(fs.getExponent(p)));
      }
    } while (!m.isProbablePrime());
    return m;
  }
}

