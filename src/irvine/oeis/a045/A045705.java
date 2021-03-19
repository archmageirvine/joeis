package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045705 Primes of the form F(i)^2 + F(j)^3, where F() are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A045705 extends A045704 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
