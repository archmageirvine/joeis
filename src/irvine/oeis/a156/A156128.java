package irvine.oeis.a156;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A156128 a(n) = 6^n * Catalan(n).
 * @author Georg Fischer
 */
public class A156128 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156128() {
    super(0, "[[0],[12,-24],[1, 1]]", "1, 6", 0);
  }
}
