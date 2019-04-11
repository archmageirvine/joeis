package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176776 <code>a(n) = 2^n-n*(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A176776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176776() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 3, 4, 5});
  }
}
