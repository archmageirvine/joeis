package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A305213.
 * @author Sean A. Irvine
 */
public class A394471 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.add(mPrime.nextPrime(mPrime.nextPrime(p)).subtract(1));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
