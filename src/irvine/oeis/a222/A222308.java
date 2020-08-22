package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222308 Let P be a one-move "rider" with move set M={(1,2)}; a(n) is the number of non-attacking positions of two indistinguishable pieces P on an n X n board.
 * @author Sean A. Irvine
 */
public class A222308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222308() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 6, 34, 114, 285, 602, 1127});
  }
}
