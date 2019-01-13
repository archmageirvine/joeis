package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217274.
 * @author Sean A. Irvine
 */
public class A217274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217274() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 7});
  }
}
