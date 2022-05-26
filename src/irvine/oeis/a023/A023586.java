package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023586 Exponent of least prime factor in prime factorization of 2*prime(n)-1.
 * @author Sean A. Irvine
 */
public class A023586 extends A000040 {

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next().multiply2().subtract(1));
    return Z.valueOf(fs.getExponent(fs.leastPrimeFactor()));
  }
}
