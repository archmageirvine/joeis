package irvine.oeis.a348;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348776 The numbers &gt;= 2 with 3 repeated.
 * @author Georg Fischer
 */
public class A348776 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348776() {
    super(1, "[0,-1,2,-1]", "2,3,3,4", 0);
  }
}
