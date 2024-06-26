package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A051342 Smallest prime factor of 1 + (product of first n primes).
 * @author Sean A. Irvine
 */
public class A051342 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next().add(1));
  }
}
