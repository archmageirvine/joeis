package irvine.oeis.a360;
// Generated by gen_seq4.pl satishol/holos at 2023-05-06 21:48

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360048 a(n) = Sum_{k=0..floor(n/2)} (-1)^k * binomial(n+1,2*k+1) * Catalan(k).
 * @author Georg Fischer
 */
public class A360048 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360048() {
    super(0, "[[0],[-5,5],[4,-7],[3,3],[-2,-1]]", "[1,2,2]", 0);
  }
}
