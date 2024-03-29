package irvine.oeis.a353;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A353410 a(n) = (tan(1*Pi/9))^(2*n) + (tan(2*Pi/9))^(2*n) + (tan(3*Pi/9))^(2*n) + (tan(4*Pi/9))^(2*n).
 * @author Georg Fischer
 */
public class A353410 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A353410() {
    super(0, "[0,-9,84,-126,36,-1]", "4,36,1044,33300,1070244", 0);
  }
}
