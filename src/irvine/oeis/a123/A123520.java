package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123520.
 * @author Sean A. Irvine
 */
public class A123520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123520() {
    super(new long[] {-1, 8, -18, 8}, new long[] {4, 28, 152, 744});
  }
}
