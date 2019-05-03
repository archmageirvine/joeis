package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094103 <code>a(n) =</code> sum along n-th diagonal of <code>A094102 (sloping</code> downward to <code>left)</code>.
 * @author Sean A. Irvine
 */
public class A094103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094103() {
    super(new long[] {-1, 0, -1, 1, 1, 1, 0}, new long[] {1, 1, 2, 3, 4, 5, 8});
  }
}
