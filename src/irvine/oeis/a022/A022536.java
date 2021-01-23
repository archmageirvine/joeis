package irvine.oeis.a022;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a010.A010808;

/**
 * A022536 Nexus numbers (n+1)^20 - n^20.
 * @author Sean A. Irvine
 */
public class A022536 extends DifferenceSequence {

  /** Construct the sequence. */
  public A022536() {
    super(new A010808());
  }
}
