package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046375 Odd numbers with exactly 5 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046375 extends A046371 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
