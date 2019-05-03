package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216162 Sequences <code>A006452</code> and <code>A216134</code> interlaced, where <code>A216134</code> are the indices of the Sophie Germain triangular numbers.
 * @author Sean A. Irvine
 */
public class A216162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216162() {
    super(new long[] {1, 0, -1, 0, -6, 0, 6, 0, 1, 0}, new long[] {1, 0, 1, 1, 2, 4, 4, 9, 11, 26});
  }
}
