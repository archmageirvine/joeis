package irvine.oeis.a203;
// manually quots/quot at 2021-11-28 20:38

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000178;

/**
 * A203523 v(n)/A000178(n); v=A203521 and A000178=(superfactorials).
 * @author Georg Fischer
 */
public class A203523 extends QuotientSequence {

  /** Construct the sequence. */
  public A203523() {
    super(new A203521(), new A000178(), 1, 0);
  }
}
