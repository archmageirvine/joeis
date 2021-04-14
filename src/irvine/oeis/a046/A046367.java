package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046367 Odd numbers divisible by the palindromic sum of its palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046367 extends A046366 {

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
