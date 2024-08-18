package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048403 Primes with consecutive digits that differ exactly by 6.
 * @author Sean A. Irvine
 */
public class A048403 extends A048408 {

  {
    setOffset(1);
  }

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
