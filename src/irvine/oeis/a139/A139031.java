package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139031.
 * @author Sean A. Irvine
 */
public class A139031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139031() {
    super(new long[] {-25, 8}, new long[] {3, 24});
  }
}
