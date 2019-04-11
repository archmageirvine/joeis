package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051866 14-gonal (or tetradecagonal) numbers: <code>a(n) = n*(6*n-5)</code>.
 * @author Sean A. Irvine
 */
public class A051866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051866() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 14});
  }
}
