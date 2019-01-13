package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107443.
 * @author Sean A. Irvine
 */
public class A107443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107443() {
    super(new long[] {4, -4, 3, -3, 1}, new long[] {1, 1, 1, 1, -3});
  }
}
