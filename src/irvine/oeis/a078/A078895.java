package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A078895 Palindromes which are a nontrivial product of 3 palindromes (which need not be distinct).
 * @author Sean A. Irvine
 */
public class A078895 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      for (final Z d : Jaguar.factor(palin).divisors()) {
        if (!d.isOne() && !d.equals(palin) && Predicates.PALINDROME.is(d)) {
          final Z nd = palin.divide(d);
          for (final Z e : Jaguar.factor(nd).divisors()) {
            if (!e.isOne() && Predicates.PALINDROME.is(e) && Predicates.PALINDROME.is(nd.divide(e))) {
              return palin;
            }
          }
        }
      }
    }
  }
}

