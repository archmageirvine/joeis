package irvine.oeis.a186;
// Generated by gen_seq4.pl ajrank at 2021-09-24 22:49

import irvine.oeis.RankSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a000.A000566;

/**
 * A186322 Adjusted joint rank sequence of (f(i)) and (g(j)) with f(i) after g(j) when f(i)=g(j), where f and g are the squares and heptagonal numbers.  Complement of A186323.
 * @author Georg Fischer
 */
public class A186322 extends RankSequence {

  /** Construct the sequence. */
  public A186322() {
    super(new A000290(), new A000566(), 1, 1);
  }
}
