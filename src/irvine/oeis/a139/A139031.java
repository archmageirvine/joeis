package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139031 Imaginary part of (4 + 3i)^n.
 * @author Sean A. Irvine
 */
public class A139031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139031() {
    super(new long[] {-25, 8}, new long[] {3, 24});
  }
}
