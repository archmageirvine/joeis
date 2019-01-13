package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146298.
 * @author Sean A. Irvine
 */
public class A146298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146298() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -1, 0, 7});
  }
}
