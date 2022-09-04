package irvine.oeis.a254;
// manually 2022-07-01

import irvine.oeis.base.RunLengthSequence;
import irvine.oeis.a228.A228495;

/**
 * A254378 Run lengths of A228495 (Characteristic function of the odd odious numbers).
 * @author Georg Fischer
 */
public class A254378 extends RunLengthSequence {

  /** Construct the sequence. */
  public A254378() {
    super(new A228495());
  }
}
