package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005100;

/**
 * A395013 allocated for Shyam Sunder Gupta.
 * @author Sean A. Irvine
 */
public class A395013 extends FilterSequence {

  /** Construct the sequence. */
  public A395013() {
    super(new A005100(), k -> Predicates.ABUNDANT.is(Functions.FIBONACCI.z(k)));
  }
}
