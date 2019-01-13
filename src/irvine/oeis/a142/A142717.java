package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142717.
 * @author Sean A. Irvine
 */
public class A142717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142717() {
    super(new long[] {1, -2, 0, 2}, new long[] {3, 5, 15, 21});
  }
}
