package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033951 Write <code>1,2,..</code>. in clockwise spiral; sequence gives numbers on positive x axis.
 * @author Sean A. Irvine
 */
public class A033951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033951() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 23});
  }
}
