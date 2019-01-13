package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273322.
 * @author Sean A. Irvine
 */
public class A273322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273322() {
    super(new long[] {-1, 4, -6, 4}, new long[] {150, 536, 1336, 2712});
  }
}
