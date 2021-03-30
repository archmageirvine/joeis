package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045962 Numbers n such that 2*A045954(n)+1 is prime.
 * @author Sean A. Irvine
 */
public class A045962 extends A045954 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.multiply2().add(1).isProbablePrime()) {
        return t;
      }
    }
  }
}
