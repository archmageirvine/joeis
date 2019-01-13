package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227488.
 * @author Sean A. Irvine
 */
public class A227488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227488() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {2192, 75884, 811076, 5876276, 35361428});
  }
}
