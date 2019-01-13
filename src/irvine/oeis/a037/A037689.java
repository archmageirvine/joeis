package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037689.
 * @author Sean A. Irvine
 */
public class A037689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037689() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {1, 7, 35, 178, 891});
  }
}
