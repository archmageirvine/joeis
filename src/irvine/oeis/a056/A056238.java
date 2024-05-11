package irvine.oeis.a056;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a007.A007622;

/**
 * A056238 Nontrivial palindromic denominators in Leibniz's harmonic triangle.
 * @author Sean A. Irvine
 */
public class A056238 extends A007622 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
    }
  }
}

