package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123268.
 * @author Sean A. Irvine
 */
public class A123268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123268() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {0, 8, 1372, 263640});
  }
}
