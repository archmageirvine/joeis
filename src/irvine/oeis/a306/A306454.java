package irvine.oeis.a306;
// manually quots/quot at 2021-11-26 22:57

import irvine.oeis.QuotientSequence;
import irvine.oeis.a013.A013946;
import irvine.oeis.a261.A261327;

/**
 * A306454 a(n) = A261327(n)/A013946(n).
 * @author Georg Fischer
 */
public class A306454 extends QuotientSequence {

  /** Construct the sequence. */
  public A306454() {
    super(new A261327(), new A013946(), 1, 0);
  }
}
