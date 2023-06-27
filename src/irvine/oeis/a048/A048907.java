package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048907 Indices of 9-gonal numbers which are also triangular.
 * @author Sean A. Irvine
 */
public class A048907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048907() {
    super(1, new long[] {1, -17, 17}, new long[] {1, 10, 154});
  }
}
