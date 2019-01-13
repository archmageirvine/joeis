package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077908.
 * @author Sean A. Irvine
 */
public class A077908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077908() {
    super(new long[] {-1, 2, 0, 0}, new long[] {1, 0, 0, 2});
  }
}
