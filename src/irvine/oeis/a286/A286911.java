package irvine.oeis.a286;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A286911 Number of edge covers in the ladder graph P_2 x P_n.
 * @author Georg Fischer
 */
public class A286911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286911() {
    super(0, new long[] {-2L, 3L, 6L}, new long[] {1L, 1L, 7L});
  }
}
