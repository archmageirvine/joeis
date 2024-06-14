package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A070809 Cototient(totient(n))=A070556(n) is not a power of 2 and n is not a prime number.
 * @author Sean A. Irvine
 */
public class A070809 extends FilterSequence {

  /** Construct the sequence. */
  public A070809() {
    super(1, new A018252(), k -> !Predicates.POWER_OF_TWO.is(Functions.COTOTIENT.l(Functions.PHI.l(k))));
  }
}
