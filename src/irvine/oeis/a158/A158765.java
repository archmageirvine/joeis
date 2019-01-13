package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158765.
 * @author Sean A. Irvine
 */
public class A158765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158765() {
    super(new long[] {1, -3, 3}, new long[] {75, 303, 683});
  }
}
