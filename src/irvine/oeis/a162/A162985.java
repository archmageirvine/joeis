package irvine.oeis.a162;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A162985 Number of Dyck paths with no UUU's and no DDD's of semilength n and having no UUDUDD's (U=(1,1), D=(1,-1)).
 * @author Georg Fischer
 */
public class A162985 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162985() {
    super(0, "[[0],[-6, 1],[9,-2],[3,-1],[0],[0,-1],[-3,-2],[3, 1]]", "1, 1, 2, 3, 6, 12, 25", 0);
  }
}
