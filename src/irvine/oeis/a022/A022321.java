package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022321.
 * @author Sean A. Irvine
 */
public class A022321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022321() {
    super(new long[] {-1, 0, 2}, new long[] {1, 7, 9});
  }
}
