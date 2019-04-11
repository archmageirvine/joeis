package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198856 <code>a(n) = 9*8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198856() {
    super(new long[] {-8, 9}, new long[] {8, 71});
  }
}
