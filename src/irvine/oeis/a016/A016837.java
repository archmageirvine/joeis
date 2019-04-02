package irvine.oeis.a016;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016837 Primes reached after k iterations of sum of n and its prime divisors = t (where t replaces n in each iteration).
 * @author Sean A. Irvine
 */
public class A016837 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    do {
      final FactorSequence fs = Cheetah.factor(m);
      for (final Z p : fs.toZArray()) {
        m = m.add(p.multiply(fs.getExponent(p)));
      }
    } while (!m.isProbablePrime());
    return m;
  }
}

