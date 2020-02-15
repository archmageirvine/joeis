package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086603 <code>a(n) = n^3*3^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A086603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086603() {
    super(new long[] {-81, 108, -54, 12}, new long[] {0, 1, 24, 243});
  }
}
