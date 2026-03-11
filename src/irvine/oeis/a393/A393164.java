package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A393164 Greatest common divisors of consecutive terms of numbers of the form 2^i*5^j.
 * @author Sean A. Irvine
 */
public class A393164 extends A003592 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.gcd(t);
  }
}

