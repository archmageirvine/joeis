package irvine.oeis.a203;
// Generated by gen_seq4.pl quots/quot at 2021-11-28 22:56

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000178;

/**
 * A203529 a(n) = A203527(n)/A000178(n-1); A000178 = (superfactorials).
 * @author Georg Fischer
 */
public class A203529 extends QuotientSequence {

  /** Construct the sequence. */
  public A203529() {
    super(new A203527(), new A000178());
  }
}
