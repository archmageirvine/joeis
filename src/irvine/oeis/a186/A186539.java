package irvine.oeis.a186;
// Generated by gen_seq4.pl ajrank at 2021-09-24 22:49

import irvine.oeis.RankSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a100.A100536;

/**
 * A186539 Adjusted joint rank sequence of (f(i)) and (g(j)) with f(i) before g(j) when f(i)=g(j), where f(i)=i^2 and g(j)=-2+3j^2.  Complement of A186540.
 * @author Georg Fischer
 */
public class A186539 extends RankSequence {

  /** Construct the sequence. */
  public A186539() {
    super(new A000290(), new A100536(), 0, 1);
  }
}
