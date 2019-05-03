package irvine.oeis.a153;

import irvine.math.z.Z;

/**
 * A153002 Primes in toothpick sequence <code>A153000</code>.
 * @author Sean A. Irvine
 */
public class A153002 extends A153000 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.isPrime()) {
        return p;
      }
    }
  }
}

