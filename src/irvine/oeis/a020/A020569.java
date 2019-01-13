package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020569.
 * @author Sean A. Irvine
 */
public class A020569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020569() {
    super(new long[] {660, -247, 28}, new long[] {1, 28, 537});
  }
}
