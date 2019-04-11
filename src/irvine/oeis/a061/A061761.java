package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061761 <code>a(n) = 2^n + 2*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A061761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061761() {
    super(new long[] {2, -5, 4}, new long[] {0, 3, 7});
  }
}
