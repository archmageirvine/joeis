package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003693.
 * @author Sean A. Irvine
 */
public class A003693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003693() {
    super(new long[] {1, -3, -2, 7, 2}, new long[] {0, 2, 3, 18, 54});
  }
}
