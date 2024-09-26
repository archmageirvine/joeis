package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072356 a(n) = if n=p*q^2 for primes p&lt;&gt;q then q*p^2 else n.
 * @author Sean A. Irvine
 */
public class A072356 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    if (fs.omega() == 2 && fs.bigOmega() == 3) {
      long r = 1;
      for (final Z p : fs.toZArray()) {
        r *= p.pow(3 - fs.getExponent(p)).longValueExact();
      }
      return Z.valueOf(r);
    }
    return Z.valueOf(mN);
  }
}
