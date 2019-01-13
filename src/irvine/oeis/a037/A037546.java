package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037546.
 * @author Sean A. Irvine
 */
public class A037546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037546() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 7, 37, 186});
  }
}
