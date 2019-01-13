package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039834.
 * @author Sean A. Irvine
 */
public class A039834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039834() {
    super(new long[] {1, -1}, new long[] {1, 1});
  }
}
