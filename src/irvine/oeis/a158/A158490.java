package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158490.
 * @author Sean A. Irvine
 */
public class A158490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158490() {
    super(new long[] {1, -3, 3}, new long[] {90, 390, 890});
  }
}
