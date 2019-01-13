package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180578.
 * @author Sean A. Irvine
 */
public class A180578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180578() {
    super(new long[] {1, -3, 3}, new long[] {27, 144, 351});
  }
}
