package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078100 1/6 of the number of ways of <code>3-coloring a 4 X n</code> grid.
 * @author Sean A. Irvine
 */
public class A078100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078100() {
    super(new long[] {6, -15, 9}, new long[] {4, 27, 187});
  }
}
