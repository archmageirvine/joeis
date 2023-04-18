package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a024.A024619;

/**
 * A063047 Minimum m where (c_n)^m is mutinous (i.e., part of sequence A027854), where c_n is the n-th positive integer not a prime power.
 * @author Sean A. Irvine
 */
public class A063047 extends A024619 {

  @Override
  public Z next() {
    final Z c = super.next();
    final FactorSequence fs = Jaguar.factor(c);
    final Z p = fs.largestPrimeFactor();
    final int k = fs.getExponent(p);
    final CR logp = CR.valueOf(p).log();
    return logp.divide(CR.valueOf(c).log().subtract(logp.multiply(k))).ceil();
  }
}
