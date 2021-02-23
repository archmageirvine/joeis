package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039675 Prime Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039675 extends A039672 {

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
