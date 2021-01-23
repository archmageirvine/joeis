package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010807;

/**
 * A022535 Nexus numbers (n+1)^19 - n^19.
 * @author Sean A. Irvine
 */
public class A022535 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022535() {
    super(new A010807());
  }
}
