package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046329 Palindromes with exactly 3 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046329 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Jaguar.factor(t).bigOmega() == 3) {
        return t;
      }
    }
  }
}
