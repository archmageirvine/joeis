package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a008.A008456;

/**
 * A022528 Nexus numbers <code>(n+1)^12-n^12</code>.
 * @author Sean A. Irvine
 */
public class A022528 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022528() {
    super(new A008456());
  }
}
