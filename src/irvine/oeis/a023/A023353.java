package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023353 Numbers k such that k remains prime through 5 iterations of the function <code>f(x) = 9x + 4</code>.
 * @author Sean A. Irvine
 */
public class A023353 extends A023325 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(59049).add(29524))) {
        return p;
      }
    }
  }
}
