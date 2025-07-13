package irvine.oeis.a138;

import irvine.math.z.Z;

/**
 * A138030 Numbers that remain prime through 8 iterations of function f(x) = 2x + 1.
 * @author Georg Fischer
 */
public class A138030 extends A138025 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(256).add(255))) {
        return p;
      }
    }
  }
}
