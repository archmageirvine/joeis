package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158135.
 * @author Sean A. Irvine
 */
public class A158135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158135() {
    super(new long[] {1, -3, 3}, new long[] {142, 572, 1290});
  }
}
