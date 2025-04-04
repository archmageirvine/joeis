package irvine.oeis.a104;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A104672 a(n) = binomial(n+4,n)*binomial(n+9,n).
 * binomial(n+4, 4)*binomial(n+9,n)
 * @author Georg Fischer
 */
public class A104672 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A104672() {
    super(0, "[[0],[-36,-13,-1],[0, 0, 1]]", "[1]", 0);
  }
}
