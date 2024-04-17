package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046334 Palindromes with exactly 8 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046334 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.BIG_OMEGA.l(t) == 8) {
        return t;
      }
    }
  }
}
