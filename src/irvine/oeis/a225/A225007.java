package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225007 Number of n X 5 0..1 arrays with rows unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A225007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225007() {
    super(0, new long[] {-1, 6, -15, 20, -15, 6},  new long[] {1, 16, 86, 296, 791, 1792});
  }
}
