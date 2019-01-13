package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291394.
 * @author Sean A. Irvine
 */
public class A291394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291394() {
    super(new long[] {-3, -6, 1, 4}, new long[] {4, 17, 66, 254});
  }
}
