package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002312;

/**
 * A071931 Non-St\u00f8rmer numbers whose largest prime factor is a St\u00f8rmer number.
 * @author Sean A. Irvine
 */
public class A071931 extends FilterSequence {

  /** Construct the sequence. */
  public A071931() {
    super(1, new A002312(), k -> Predicates.STORMER.is(Functions.GPF.z(k)));
  }
}
