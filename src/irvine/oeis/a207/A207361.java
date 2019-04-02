package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207361 Displacement under constant discrete unit surge.
 * @author Sean A. Irvine
 */
public class A207361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207361() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 11, 53, 173, 448});
  }
}
