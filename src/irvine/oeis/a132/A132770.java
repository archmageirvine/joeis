package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132770 <code>a(n) = n*(n + 28)</code>.
 * @author Sean A. Irvine
 */
public class A132770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132770() {
    super(new long[] {1, -3, 3}, new long[] {0, 29, 60});
  }
}
