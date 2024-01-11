package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046328 Palindromes with exactly 2 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046328 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Jaguar.factor(t).isSemiprime()) {
        return t;
      }
    }
  }
}
