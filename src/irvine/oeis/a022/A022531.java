package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010803;

/**
 * A022531 Nexus numbers (n+1)^15 - n^15.
 * @author Sean A. Irvine
 */
public class A022531 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022531() {
    super(new A010803());
  }
}
