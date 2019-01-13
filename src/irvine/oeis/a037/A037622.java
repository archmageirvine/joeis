package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037622.
 * @author Sean A. Irvine
 */
public class A037622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037622() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 16, 131, 1050});
  }
}
