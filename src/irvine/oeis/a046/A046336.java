package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046336 Palindromes with exactly 10 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046336 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Cheetah.factor(t).bigOmega() == 10) {
        return t;
      }
    }
  }
}
