package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254709 Indices of pentagonal numbers <code>(A000326)</code> which are also centered square numbers <code>(A001844)</code>.
 * @author Sean A. Irvine
 */
public class A254709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254709() {
    super(new long[] {1, -1, -14, 14, 1}, new long[] {1, 2, 10, 25, 137});
  }
}
