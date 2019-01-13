package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039835.
 * @author Sean A. Irvine
 */
public class A039835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039835() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {1, 10, 493, 3382, 158905});
  }
}
