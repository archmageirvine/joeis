package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a049.A049419;

/**
 * A388973 The number of exponential divisors of the numbers whose number of exponential divisors is a power of 2.
 * @author Sean A. Irvine
 */
public class A388973 extends FilterSequence {

  /** Construct the sequence. */
  public A388973() {
    super(1, new A049419(), Predicates.POWER_OF_TWO::is);
  }
}

