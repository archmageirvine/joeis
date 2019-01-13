package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158657.
 * @author Sean A. Irvine
 */
public class A158657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158657() {
    super(new long[] {1, -3, 3}, new long[] {756, 3108, 7028});
  }
}
