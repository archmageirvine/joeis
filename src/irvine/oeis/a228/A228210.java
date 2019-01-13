package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228210.
 * @author Sean A. Irvine
 */
public class A228210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228210() {
    super(new long[] {-1, 0, 3, 0}, new long[] {7, 8, 13, 17});
  }
}
