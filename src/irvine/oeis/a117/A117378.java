package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117378.
 * @author Sean A. Irvine
 */
public class A117378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117378() {
    super(new long[] {-1, 1}, new long[] {1, -3});
  }
}
