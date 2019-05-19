package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010806;

/**
 * A022534 Nexus numbers <code>(n+1)^18 - n^18</code>.
 * @author Sean A. Irvine
 */
public class A022534 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022534() {
    super(new A010806());
  }
}
