package irvine.oeis.a054;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A054970 Index numbers for palindromic hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A054970 extends A000384 {

  /** Construct the sequence. */
  public A054970() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z hex = super.next();
      if (Predicates.PALINDROME.is(hex)) {
        return mN;
      }
    }
  }
}
