package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010809;

/**
 * A022537 Nexus numbers (n+1)^21 - n^21.
 * @author Sean A. Irvine
 */
public class A022537 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022537() {
    super(new A010809());
  }
}
