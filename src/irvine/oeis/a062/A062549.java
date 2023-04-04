package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A062549 a(n) is the smallest number m such that m! is divisible by the left factorial !n (A003422).
 * @author Sean A. Irvine
 */
public class A062549 extends A003422 {

  // Conjectural, do not use to extend the sequence

  {
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    final Z gpf = fs.largestPrimeFactor();
    return gpf.pow(fs.getExponent(gpf));
  }
}
