package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028295.
 * @author Sean A. Irvine
 */
public class A028295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028295() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {133, 1903, 10561, 38015, 106461, 252737, 533397});
  }
}
