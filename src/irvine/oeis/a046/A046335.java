package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046335 Palindromes with exactly 9 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046335 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Jaguar.factor(t).bigOmega() == 9) {
        return t;
      }
    }
  }
}
