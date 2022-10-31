package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046374 Odd numbers with exactly 4 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046374 extends A046370 {

  {
  }

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
