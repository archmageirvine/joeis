package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046332 Palindromes with exactly 6 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046332 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.BIG_OMEGA.l(t) == 6) {
        return t;
      }
    }
  }
}
