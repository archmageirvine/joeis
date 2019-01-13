package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055849.
 * @author Sean A. Irvine
 */
public class A055849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055849() {
    super(new long[] {-1, 3}, new long[] {1, 9});
  }
}
