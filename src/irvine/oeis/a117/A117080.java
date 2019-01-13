package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117080.
 * @author Sean A. Irvine
 */
public class A117080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117080() {
    super(new long[] {-1, 1, -2, 3}, new long[] {1, 3, 8, 18});
  }
}
