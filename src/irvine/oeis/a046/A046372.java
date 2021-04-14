package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046372 Odd numbers with exactly 2 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046372 extends A046368 {

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
