package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288960.
 * @author Sean A. Irvine
 */
public class A288960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288960() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 60, 1248, 8400, 35520, 114660, 309120});
  }
}
