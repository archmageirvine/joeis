package irvine.oeis.a360;
// Generated by gen_seq4.pl satishol/holos at 2023-05-06 21:48

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360049 a(n) = Sum_{k=0..floor(n/3)} (-1)^k * binomial(n+2,3*k+2) * Catalan(k).
 * @author Georg Fischer
 */
public class A360049 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360049() {
    super(0, "[[0],[-3,3],[6],[-6,-6],[8,4],[-3,-1]]", "[1,3,6,9]", 0);
  }
}
