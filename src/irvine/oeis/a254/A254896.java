package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254896 Octagonal numbers (A000567) that are also centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A254896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254896() {
    super(new long[] {1, -1, -9602, 9602, 1}, new long[] {1, 481, 8321, 4617761, 79897441});
  }
}
