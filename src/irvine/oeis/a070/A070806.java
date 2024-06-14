package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A070806 Cototient(totient(n))=A070556(n) is a power of 2 and n is a prime number.
 * @author Sean A. Irvine
 */
public class A070806 extends FilterSequence {

  /** Construct the sequence. */
  public A070806() {
    super(1, new A000040(), k -> Predicates.POWER_OF_TWO.is(Functions.COTOTIENT.l(Functions.PHI.l(k))));
  }
}
