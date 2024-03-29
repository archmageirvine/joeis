package irvine.oeis.a167;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A167635 Number of Dyck paths of semilength n, having no ascents and no descents of length 1, and having no peaks at odd level.
 * @author Georg Fischer
 */
public class A167635 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167635() {
    super(0, "[[0],[-6, 1],[1],[3],[7,-2],[5,-4],[1],[1, 1]]", "1, 0, 1, 0, 2, 0, 5", 0);
  }
}
