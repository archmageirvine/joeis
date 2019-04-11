package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051890 <code>a(n) = 2*(n^2 - n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A051890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051890() {
    super(new long[] {1, -3, 3}, new long[] {2, 2, 6});
  }
}
