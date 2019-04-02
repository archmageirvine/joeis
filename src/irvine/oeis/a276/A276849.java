package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276849 a(0) = 5, a(1) = 2; for n&gt;1, a(n) = 2*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A276849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276849() {
    super(new long[] {1, 2}, new long[] {5, 2});
  }
}
