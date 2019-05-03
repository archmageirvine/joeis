package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245827 Szeged index of the grid graph <code>P_3 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A245827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245827() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 59, 216, 526});
  }
}
