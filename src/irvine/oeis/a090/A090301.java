package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090301.
 * @author Sean A. Irvine
 */
public class A090301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090301() {
    super(new long[] {1, 15}, new long[] {2, 15});
  }
}
