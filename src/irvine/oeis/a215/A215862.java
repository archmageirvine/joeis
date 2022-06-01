package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215862 Number of simple labeled graphs on n+2 nodes with exactly n connected components that are trees or cycles.
 * @author Sean A. Irvine
 */
public class A215862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215862() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 19, 55, 125});
  }
}
