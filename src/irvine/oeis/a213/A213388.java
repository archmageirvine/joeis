package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213388.
 * @author Sean A. Irvine
 */
public class A213388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213388() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 6, 21, 48, 93});
  }
}
