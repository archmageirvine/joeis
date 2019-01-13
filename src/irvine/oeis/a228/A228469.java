package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228469.
 * @author Sean A. Irvine
 */
public class A228469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228469() {
    super(new long[] {1, 0, 6, 0}, new long[] {2, 8, 13, 49});
  }
}
