package irvine.oeis.a350;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350965 a(n) = sqrt(6*A138288(n)^2 - 2).
 * @author Georg Fischer
 */
public class A350965 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350965() {
    super(0, "[0,-1,10,-1]", "2,22,218", 0);
  }
}
