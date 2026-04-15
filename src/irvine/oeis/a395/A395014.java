package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005101;

/**
 * A395014 allocated for Shyam Sunder Gupta.
 * @author Sean A. Irvine
 */
public class A395014 extends FilterSequence {

  /** Construct the sequence. */
  public A395014() {
    super(new A005101(), k -> Predicates.DEFICIENT.is(Functions.FIBONACCI.z(k)));
  }
}
