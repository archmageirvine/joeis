package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213837.
 * @author Sean A. Irvine
 */
public class A213837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213837() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 13, 52, 134});
  }
}
