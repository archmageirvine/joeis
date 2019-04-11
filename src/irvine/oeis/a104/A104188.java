package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104188 <code>a(n) = 4n*(4n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A104188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104188() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 56});
  }
}
