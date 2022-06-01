package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082106 Main diagonal of number array A082105.
 * @author Sean A. Irvine
 */
public class A082106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082106() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 33, 118, 321});
  }
}
