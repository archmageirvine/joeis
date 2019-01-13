package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273625.
 * @author Sean A. Irvine
 */
public class A273625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273625() {
    super(new long[] {-1, 28, -204, 434, -204, 28}, new long[] {1, 14, 228, 3948, 69905, 1248072});
  }
}
