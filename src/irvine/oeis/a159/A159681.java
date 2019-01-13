package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159681.
 * @author Sean A. Irvine
 */
public class A159681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159681() {
    super(new long[] {1, -143, 143}, new long[] {0, 24, 3432});
  }
}
