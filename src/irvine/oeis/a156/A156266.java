package irvine.oeis.a156;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-30 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A156266 a(n) = 7^n*Catalan(n).
 * @author Georg Fischer
 */
public class A156266 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156266() {
    super(0, "[[0],[14,-28],[1, 1]]", "1, 7", 0);
  }
}
