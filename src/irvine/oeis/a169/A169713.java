package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169713 The function W_n(10) (see Borwein et al. reference for definition).
 * @author Sean A. Irvine
 */
public class A169713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169713() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 252, 4653, 31504, 127905, 384156});
  }
}
