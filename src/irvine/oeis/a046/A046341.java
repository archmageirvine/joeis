package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046341 Composite palindromes with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046341 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime() && (Cheetah.factor(t).bigOmega() & 1) == 1) {
        return t;
      }
    }
  }
}
