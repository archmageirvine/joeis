package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117374.
 * @author Sean A. Irvine
 */
public class A117374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117374() {
    super(new long[] {-1, 1, 0}, new long[] {1, -3, 1});
  }
}
