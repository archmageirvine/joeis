package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018845 Number of iterations required for the sum of n and its prime divisors = t to reach a prime (where t replaces n in each iteration) in A016837.
 * @author Sean A. Irvine
 */
public class A018845 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long c = 0;
    do {
      final FactorSequence fs = Cheetah.factor(m);
      for (final Z p : fs.toZArray()) {
        m = m.add(p.multiply(fs.getExponent(p)));
      }
      ++c;
    } while (!m.isProbablePrime());
    return Z.valueOf(c);
  }
}

