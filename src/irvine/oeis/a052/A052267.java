package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052267.
 * @author Sean A. Irvine
 */
public class A052267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052267() {
    super(new long[] {1, -6, 12, -2, -27, 36, 0, -36, 27, 2, -12, 6}, new long[] {1, 6, 27, 92, 267, 678, 1561, 3312, 6582, 12372, 22194, 38232});
  }
}
