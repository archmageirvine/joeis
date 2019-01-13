package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019854.
 * @author Sean A. Irvine
 */
public class A019854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019854() {
    super(new long[] {330, -151, 22}, new long[] {1, 22, 333});
  }
}
