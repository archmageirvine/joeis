package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028130.
 * @author Sean A. Irvine
 */
public class A028130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028130() {
    super(new long[] {-1344, 920, -230, 25}, new long[] {1, 25, 395, 5045});
  }
}
