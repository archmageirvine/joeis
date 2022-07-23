package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058077 Binomial coefficients formed from consecutive primes: a(n) = binomial( prime(n+1), prime(n) ).
 * @author Sean A. Irvine
 */
public class A058077 extends A000040 {

  protected Z mP = super.next();

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next();
    return Binomial.binomial(mP, t);
  }
}

