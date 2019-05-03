package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102620 Number of legal Go positions on a <code>1 X n</code> board (for which <code>3^n</code> is a trivial upper <code>bound)</code>.
 * @author Sean A. Irvine
 */
public class A102620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102620() {
    super(new long[] {1, -1, 3}, new long[] {1, 5, 15});
  }
}
