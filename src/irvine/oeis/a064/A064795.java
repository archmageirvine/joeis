package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a048.A048986;

/**
 * A064795 Home primes in base 2: primes reached when you start with n and (working in base 2) concatenate its prime factors (A048985); repeat until a prime is reached (or -1 if no prime is ever reached).
 * @author Sean A. Irvine
 */
public class A064795 extends A048986 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}

