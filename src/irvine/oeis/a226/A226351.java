package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226351.
 * @author Sean A. Irvine
 */
public class A226351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226351() {
    super(new long[] {6, 1, -26, 1, 19, 4}, new long[] {1, 3, 26, 163, 1125, 7546});
  }
}
