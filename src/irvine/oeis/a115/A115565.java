package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115565.
 * @author Sean A. Irvine
 */
public class A115565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115565() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {11, 61, 281, 911, 2311});
  }
}
