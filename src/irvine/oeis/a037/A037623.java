package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037623.
 * @author Sean A. Irvine
 */
public class A037623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037623() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 18, 165, 1487});
  }
}
