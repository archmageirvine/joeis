package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158121 Given n points in the complex plane, let M(n) the number of distinct Moebius transformations that take 3 distinct points to 3 distinct points. Note that the triples may have some or all of the points in common.
 * @author Sean A. Irvine
 */
public class A158121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158121() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {6, 93, 591, 2381, 7316, 18761, 42253});
  }
}
