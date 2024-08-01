package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A064032 Product of unitary divisors of binomial(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A064032 extends A001405 {

  /** Construct the sequence. */
  public A064032() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    return f.pow(Jaguar.factor(f).unitarySigma0().divide2());
  }
}
