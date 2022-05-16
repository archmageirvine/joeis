package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(t).bigOmega() == 6) {
        return t;
      }
    }
  }
}
