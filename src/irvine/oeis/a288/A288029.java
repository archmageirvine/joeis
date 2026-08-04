package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288029 Number of minimal edge covers in the ladder graph P_2 X P_n.
 * @author Georg Fischer
 */
public class A288029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288029() {
    super(0, new long[] {-1L, 0L, 1L, 2L, 1L, 2L}, new long[] {1L, 1L, 2L, 6L, 17L, 45L});
  }
}
