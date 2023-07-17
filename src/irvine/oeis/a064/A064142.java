package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A064142 Sum of all distinct primes dividing central binomial coefficient C(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A064142 extends A001405 {

  /** Construct the sequence. */
  public A064142() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sopf();
  }
}
