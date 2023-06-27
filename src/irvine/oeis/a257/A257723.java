package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257723 Hexagonal numbers (A000384) that are the sum of twelve consecutive hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A257723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257723() {
    super(1, new long[] {1, -1, -37634, 37634, 1}, new long[] {47278, 30011878, 1773905266, 1129461664906L, 66759145382566L});
  }
}
