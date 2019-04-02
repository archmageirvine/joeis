package irvine.oeis.a008;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A008438 Sum of divisors of 2n + 1.
 * @author Sean A. Irvine
 */
public class A008438 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A008438() {
    super(new PeriodicSequence(4, -4), 0);
  }
}

