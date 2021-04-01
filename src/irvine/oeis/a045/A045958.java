package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045958 Numbers k in A045954 such that k+1 is prime.
 * @author Sean A. Irvine
 */
public class A045958 extends A045954 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.add(1).isProbablePrime()) {
        return t;
      }
    }
  }
}
