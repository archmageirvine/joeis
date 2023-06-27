package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261481 Number of set partitions of [n] into exactly five parts such that no part contains two elements with a circular distance less than three.
 * @author Sean A. Irvine
 */
public class A261481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261481() {
    super(5, new long[] {36, 36, 17, -32, -47, -18, -6, 12, 1, 2}, new long[] {1, 3, 14, 44, 138, 458, 1397, 4219, 12974, 39270});
  }
}
