package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048900 Heptagonal pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A048900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048900() {
    super(new long[] {1, -3843, 3843}, new long[] {1, 4347, 16701685});
  }
}
