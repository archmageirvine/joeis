package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158406.
 * @author Sean A. Irvine
 */
public class A158406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158406() {
    super(new long[] {1, -3, 3}, new long[] {902, 3604, 8106});
  }
}
