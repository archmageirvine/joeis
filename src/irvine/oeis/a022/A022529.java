package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010801;

/**
 * A022529 Nexus numbers (n+1)^13-n^13.
 * @author Sean A. Irvine
 */
public class A022529 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022529() {
    super(new A010801());
  }
}
