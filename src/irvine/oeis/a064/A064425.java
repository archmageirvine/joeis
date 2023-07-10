package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;

/**
 * A064425 Gaps between where primes occur in A064413.
 * @author Sean A. Irvine
 */
public class A064425 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064425() {
    super(1, new A064423());
  }
}
