package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a049.A049419;

/**
 * A388972 Numbers whose number of exponential divisors is a power of 2.
 * @author Sean A. Irvine
 */
public class A388972 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A388972() {
    super(1, new A049419(), Predicates.POWER_OF_TWO::is);
  }
}

