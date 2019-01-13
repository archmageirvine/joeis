package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158553.
 * @author Sean A. Irvine
 */
public class A158553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158553() {
    super(new long[] {1, -3, 3}, new long[] {182, 770, 1750});
  }
}
