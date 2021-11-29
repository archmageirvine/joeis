package irvine.oeis.a203;
// manually quots/quot at 2021-11-28 20:38

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000178;

/**
 * A203533 v(n)/A000178(n); v=A203527 and A000178=(superfactorials).
 * @author Georg Fischer
 */
public class A203533 extends QuotientSequence {

  /** Construct the sequence. */
  public A203533() {
    super(new A203530(), new A000178());
  }
}
