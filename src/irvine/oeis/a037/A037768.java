package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037768.
 * @author Sean A. Irvine
 */
public class A037768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037768() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {3, 21, 149, 1044, 7311});
  }
}
