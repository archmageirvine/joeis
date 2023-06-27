package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254228 Indices of heptagonal numbers (A000566) which are also centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A254228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254228() {
    super(1, new long[] {1, -1, -322, 322, 1}, new long[] {1, 41, 185, 13105, 59473});
  }
}
