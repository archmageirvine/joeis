package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045703 Primes of the form F(i)^2 + F(j)^2, where F() are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A045703 extends A045702 {

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
