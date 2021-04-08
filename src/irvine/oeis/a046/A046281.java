package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046281 Prime numbers that are the sum of the first k lucky numbers, A046279(k), for some k.
 * @author Sean A. Irvine
 */
public class A046281 extends A046279 {

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
