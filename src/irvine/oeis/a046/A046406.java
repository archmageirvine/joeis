package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046406 Odd numbers with exactly 4 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046406 extends A046402 {

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
