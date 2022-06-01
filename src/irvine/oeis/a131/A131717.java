package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131717 Natural numbers A000027 with 6n+4 and 6n+5 terms swapped.
 * @author Sean A. Irvine
 */
public class A131717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131717() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 5, 4, 6, 7});
  }
}
