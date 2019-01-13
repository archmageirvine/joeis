package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036257.
 * @author Sean A. Irvine
 */
public class A036257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036257() {
    super(new long[] {12500, -3125, 130}, new long[] {1, 90, 9700});
  }
}
