package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158396.
 * @author Sean A. Irvine
 */
public class A158396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158396() {
    super(new long[] {1, -3, 3}, new long[] {731, 2920, 6567});
  }
}
