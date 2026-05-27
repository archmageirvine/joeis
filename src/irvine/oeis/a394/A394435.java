package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A394435 allocated for Rudra Jadhav.
 * @author Sean A. Irvine
 */
public class A394435 extends FilterSequence {

  /** Construct the sequence. */
  public A394435() {
    super(1, new A000040(), p -> Predicates.SQUARE.is(Functions.SOPFR.z(p.subtract(1)).square().add(Functions.SOPFR.z(p.add(1)).square())));
  }
}
