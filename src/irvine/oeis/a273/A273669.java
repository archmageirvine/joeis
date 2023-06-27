package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273669 Decimal representation ends with either 2 or 9.
 * @author Sean A. Irvine
 */
public class A273669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273669() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 9, 12});
  }
}
