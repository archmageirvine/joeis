package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010804;

/**
 * A022532 Nexus numbers (n+1)^16-n^16.
 * @author Sean A. Irvine
 */
public class A022532 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022532() {
    super(new A010804());
  }
}
