package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005826 Worst case of a Jacobi symbol algorithm.
 * @author Sean A. Irvine
 */
public class A005826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005826() {
    super(new long[] {4, -10, 0, 5}, new long[] {1, 5, 31, 141});
  }
}

