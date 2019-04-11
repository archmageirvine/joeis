package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058877 Number of labeled acyclic digraphs with n nodes containing exactly <code>n-1</code> points of in-degree zero.
 * @author Sean A. Irvine
 */
public class A058877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058877() {
    super(new long[] {-4, 12, -13, 6}, new long[] {0, 2, 9, 28});
  }
}
