package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010802;

/**
 * A022530 Nexus numbers <code>(n+1)^14 - n^14</code>.
 * @author Sean A. Irvine
 */
public class A022530 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022530() {
    super(new A010802());
  }
}
