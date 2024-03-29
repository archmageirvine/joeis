package irvine.oeis.a349;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349803 a(3*n) = 1 + 4*n^2, a(1+3*n) = 2 + 4*n*(n+1), a(2+3*n) = 5 + 4*n*(n+1).
 * @author Georg Fischer
 */
public class A349803 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349803() {
    super(0, "[0,1,-1,0,-2,2,0,1,-1]", "1,2,5,5,10,13,17,26", 0);
  }
}
