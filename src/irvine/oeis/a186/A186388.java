package irvine.oeis.a186;
// Generated by gen_seq4.pl ajrank at 2021-09-24 22:49

import irvine.oeis.RankSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a008.A008588;

/**
 * A186388 Adjusted joint rank sequence of (f(i)) and (g(j)) with f(i) before g(j) when f(i)=g(j), where f(i)=6i and g(j)=j(j+1)/2 (triangular number).  Complement of A186387.
 * @author Georg Fischer
 */
public class A186388 extends RankSequence {

  /** Construct the sequence. */
  public A186388() {
    super(new A008588(), new A000217(), 0, 2);
  }
}
