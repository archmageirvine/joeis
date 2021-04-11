package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A046453 Composite numbers n such that concatenation of the 4 prime factors of n is a palindrome.
 * @author Sean A. Irvine
 */
public class A046453 extends A046447 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Cheetah.factor(t).bigOmega() == 4) {
        return t;
      }
    }
  }
}
