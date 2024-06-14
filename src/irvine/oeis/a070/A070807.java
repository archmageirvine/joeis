package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A070807 Composite numbers n such that Cototient(totient(n))=A070556(n) is power of 2.
 * @author Sean A. Irvine
 */
public class A070807 extends FilterSequence {

  /** Construct the sequence. */
  public A070807() {
    super(1, new A002808(), k -> Predicates.POWER_OF_TWO.is(Functions.COTOTIENT.l(Functions.PHI.l(k))));
  }
}
