package irvine.oeis.a203;
// manually quots/quot at 2021-11-28 20:38

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000178;

/**
 * A203533 a(n) = A203530(n)/A000178(n-1); A000178 = (superfactorials).
 * @author Georg Fischer
 */
public class A203533 extends QuotientSequence {

  /** Construct the sequence. */
  public A203533() {
    super(new A203530(), new A000178());
  }
}
