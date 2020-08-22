package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241527 n^3 + (3^n+1)/2.
 * @author Sean A. Irvine
 */
public class A241527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241527() {
    super(new long[] {3, -13, 22, -18, 7}, new long[] {1, 3, 13, 41, 105});
  }
}
