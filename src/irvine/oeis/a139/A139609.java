package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139609 <code>a(n) = 36*n + 9</code>.
 * @author Sean A. Irvine
 */
public class A139609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139609() {
    super(new long[] {-1, 2}, new long[] {9, 45});
  }
}
