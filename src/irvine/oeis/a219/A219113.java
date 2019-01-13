package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219113.
 * @author Sean A. Irvine
 */
public class A219113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219113() {
    super(new long[] {1, -99, 99}, new long[] {1, 61, 5941});
  }
}
