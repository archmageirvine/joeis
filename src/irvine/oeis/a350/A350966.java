package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350966 a(n) = sqrt(28*A296377(n)^2 - 3).
 * @author Georg Fischer
 */
public class A350966 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350966() {
    super(1, "[0,-1,0,254,0,-1]", "5,37,1307,9403,331973", 0);
  }
}
