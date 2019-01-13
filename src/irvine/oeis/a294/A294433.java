package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294433.
 * @author Sean A. Irvine
 */
public class A294433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294433() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 16, 94, 331, 871});
  }
}
