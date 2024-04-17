package irvine.oeis.a046;

import irvine.math.function.Functions;
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
      if (Functions.BIG_OMEGA.l(t) == 3) {
        return t;
      }
    }
  }
}
