package irvine.oeis.a047;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A047739 Economical palindromes.
 * @author Sean A. Irvine
 */
public class A047739 extends A002113 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (Predicates.ECONOMICAL.is(palin.longValueExact())) {
        return palin;
      }
    }
  }
}
