package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198695 11*4^n-1.
 * @author Sean A. Irvine
 */
public class A198695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198695() {
    super(new long[] {-4, 5}, new long[] {10, 43});
  }
}
