package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039825.
 * @author Sean A. Irvine
 */
public class A039825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039825() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {2, 3, 5, 7, 9});
  }
}
