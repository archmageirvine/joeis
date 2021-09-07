package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A051342 Smallest prime factor of 1 + (product of first n primes).
 * @author Sean A. Irvine
 */
public class A051342 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next().add(1)).toZArray()[0];
  }
}
