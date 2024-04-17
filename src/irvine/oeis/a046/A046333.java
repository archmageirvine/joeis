package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046333 Palindromes with exactly 7 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046333 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.BIG_OMEGA.l(t) == 7) {
        return t;
      }
    }
  }
}
