package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010805;

/**
 * A022533 Nexus numbers <code>(n+1)^17 - n^17</code>.
 * @author Sean A. Irvine
 */
public class A022533 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022533() {
    super(new A010805());
  }
}
