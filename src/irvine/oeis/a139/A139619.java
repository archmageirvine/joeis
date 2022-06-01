package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139619 a(n) = 171*n + 19.
 * @author Sean A. Irvine
 */
public class A139619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139619() {
    super(new long[] {-1, 2}, new long[] {19, 190});
  }
}
