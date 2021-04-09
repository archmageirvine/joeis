package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046407 Odd numbers with exactly 5 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046407 extends A046403 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven()) {
        return t;
      }
    }
  }
}
