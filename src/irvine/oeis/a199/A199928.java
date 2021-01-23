package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199928 Trisection 1 of A199802.
 * @author Sean A. Irvine
 */
public class A199928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199928() {
    super(new long[] {-1, 1, -5, -1}, new long[] {2, -1, -8, 15});
  }
}
