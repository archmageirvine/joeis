package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213557.
 * @author Sean A. Irvine
 */
public class A213557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213557() {
    super(new long[] {1, -1, -4, 6, 2, -8, 5}, new long[] {1, 6, 23, 70, 184, 438, 971});
  }
}
