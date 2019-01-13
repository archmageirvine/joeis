package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084068.
 * @author Sean A. Irvine
 */
public class A084068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084068() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 2, 7, 12});
  }
}
