package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078100 1/6 of the number of ways of 3-coloring a 4 X n grid.
 * @author Sean A. Irvine
 */
public class A078100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078100() {
    super(1, new long[] {6, -15, 9}, new long[] {4, 27, 187});
  }
}
