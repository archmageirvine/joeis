package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190089 Row sums of the triangular matrix A190088.
 * @author Sean A. Irvine
 */
public class A190089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190089() {
    super(new long[] {1, 2, 5}, new long[] {1, 4, 21});
  }
}
