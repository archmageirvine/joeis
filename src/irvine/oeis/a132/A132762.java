package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132762 <code>a(n) = n*(n + 19)</code>.
 * @author Sean A. Irvine
 */
public class A132762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132762() {
    super(new long[] {1, -3, 3}, new long[] {0, 20, 42});
  }
}
