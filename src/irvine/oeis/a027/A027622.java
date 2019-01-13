package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027622.
 * @author Sean A. Irvine
 */
public class A027622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027622() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1114, 3413, 8476, 18247, 35414, 63529});
  }
}
