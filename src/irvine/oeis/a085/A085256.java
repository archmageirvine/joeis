package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003586;

/**
 * A085256 3-smooth numbers whose arithmetic derivatives are also 3-smooth.
 * @author Sean A. Irvine
 */
public class A085256 extends FilterSequence {

  /** Construct the sequence. */
  public A085256() {
    super(1, new A003586().skip(), k -> Predicates.SMOOTH.is(3, Functions.ARD.z(k)));
  }
}
