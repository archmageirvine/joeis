package irvine.oeis.a105;
// Generated by gen_seq4.pl dfinite/holos at 2022-07-29 23:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105641 Number of hill-free Dyck paths of semilength n, having no UUDD's, where U=(1,1) and D=(1,-1) (a hill in a Dyck path is a peak at level 1).
 * @author Georg Fischer
 */
public class A105641 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105641() {
    super(2, "[[0],[-5, 1],[-5, 1],[-14, 4],[-2,-2],[-5, 1],[5,-7],[2, 2]]", "0, 1, 2, 5, 14, 39, 111", 0);
  }
}
