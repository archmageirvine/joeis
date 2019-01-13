package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289809.
 * @author Sean A. Irvine
 */
public class A289809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289809() {
    super(new long[] {-1, 1, 5, -3, -9, 1, 7, 1}, new long[] {1, 4, 12, 38, 114, 354, 1076, 3311});
  }
}
