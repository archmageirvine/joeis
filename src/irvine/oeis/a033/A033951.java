package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033951 Write 1,2,... in clockwise spiral; sequence gives numbers on positive x axis.
 * @author Sean A. Irvine
 */
public class A033951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033951() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 23});
  }
}
