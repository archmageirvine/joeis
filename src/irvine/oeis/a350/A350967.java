package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350967 a(n) = sqrt(84*A144930(n)^2 - 3).
 * @author Georg Fischer
 */
public class A350967 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350967() {
    super(1, "[0,-1,110,-1]", "9,999,109881", 0);
  }
}
