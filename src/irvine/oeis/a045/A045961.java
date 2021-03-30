package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045961 Twin A045954's (middle terms) that are primes.
 * @author Sean A. Irvine
 */
public class A045961 extends A045957 {

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
