package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228472.
 * @author Sean A. Irvine
 */
public class A228472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228472() {
    super(new long[] {1, 0, 6, 0}, new long[] {5, 8, 30, 49});
  }
}
