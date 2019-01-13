package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153266.
 * @author Sean A. Irvine
 */
public class A153266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153266() {
    super(new long[] {-4, 11, -1}, new long[] {13, -19, 162});
  }
}
