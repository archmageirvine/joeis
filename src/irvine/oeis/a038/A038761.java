package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038761.
 * @author Sean A. Irvine
 */
public class A038761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038761() {
    super(new long[] {-1, 6}, new long[] {1, 9});
  }
}
