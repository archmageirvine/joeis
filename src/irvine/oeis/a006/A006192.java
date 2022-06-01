package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006192 Number of nonintersecting (or self-avoiding) rook paths joining opposite corners of 3 X n board.
 * @author Sean A. Irvine
 */
public class A006192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006192() {
    super(new long[] {1, 2, -3, 4}, new long[] {1, 4, 12, 38});
  }
}

