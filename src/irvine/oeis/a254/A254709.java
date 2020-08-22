package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254709 Indices of pentagonal numbers (A000326) which are also centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A254709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254709() {
    super(new long[] {1, -1, -14, 14, 1}, new long[] {1, 2, 10, 25, 137});
  }
}
