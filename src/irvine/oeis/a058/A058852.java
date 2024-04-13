package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A058852 Palindromes n such that n and n^2 have same digit sum.
 * @author Sean A. Irvine
 */
public class A058852 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.DIGIT_SUM.l(t) == Functions.DIGIT_SUM.l(t.square())) {
        return t;
      }
    }
  }
}
