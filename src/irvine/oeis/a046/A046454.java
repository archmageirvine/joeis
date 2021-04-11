package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A046454 Concatenation of the 5 prime factors of composite a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A046454 extends A046447 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Cheetah.factor(t).bigOmega() == 5) {
        return t;
      }
    }
  }
}
