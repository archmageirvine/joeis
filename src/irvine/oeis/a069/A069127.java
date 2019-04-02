package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069127 Centered 14-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069127() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 43});
  }
}
