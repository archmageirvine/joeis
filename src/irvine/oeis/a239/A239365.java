package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239365 Numbers n such that 10*n^2+4 is a square.
 * @author Sean A. Irvine
 */
public class A239365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239365() {
    super(1, new long[] {-1, 38}, new long[] {12, 456});
  }
}
