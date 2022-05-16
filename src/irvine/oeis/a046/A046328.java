package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
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
      final int isSemi = Jaguar.factor(t).isSemiprime();
      if (isSemi == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException();
      }
      if (isSemi == FactorSequence.YES) {
        return t;
      }
    }
  }
}
