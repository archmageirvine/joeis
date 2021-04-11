package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A046452 Numbers that are the product of 3 prime factors whose concatenation is a palindrome.
 * @author Sean A. Irvine
 */
public class A046452 extends A046447 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Cheetah.factor(t).bigOmega() == 3) {
        return t;
      }
    }
  }
}
