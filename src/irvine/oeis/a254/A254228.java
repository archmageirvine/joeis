package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254228 Indices of heptagonal numbers <code>(A000566)</code> which are also centered square numbers <code>(A001844)</code>.
 * @author Sean A. Irvine
 */
public class A254228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254228() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {1, 41, 185, 13105, 59473});
  }
}
