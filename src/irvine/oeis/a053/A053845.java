package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A053845 Primes of form prime(1) + ... + prime(k) + 1.
 * @author Sean A. Irvine
 */
public class A053845 extends A007504 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
