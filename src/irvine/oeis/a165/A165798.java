package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165798.
 * @author Sean A. Irvine
 */
public class A165798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165798() {
    super(new long[] {1, -3, 3}, new long[] {65, 260, 585});
  }
}
