package irvine.oeis.a203;
// manually quots/quot at 2021-11-28 20:38

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000178;

/**
 * A203466 a(n) = A203306(n)/A000178(n) where A000178 are superfactorials.
 * @author Georg Fischer
 */
public class A203466 extends QuotientSequence {

  /** Construct the sequence. */
  public A203466() {
    super(new A203306(), new A000178(), 1, 0);
  }
}
