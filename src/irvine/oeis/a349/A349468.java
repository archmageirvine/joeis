package irvine.oeis.a349;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349468 a(n) = (4*n)! / (n! * (2*n)!).
 * @author Georg Fischer
 */
public class A349468 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349468() {
    super(0, "[[0],[-12, 64,-64],[0, 1]]", "1, 12", 0);
  }
}
