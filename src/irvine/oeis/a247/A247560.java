package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247560 <code>a(n) = 3*a(n-1) - 4*a(n-2)</code> with <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A247560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247560() {
    super(new long[] {-4, 3}, new long[] {1, 1});
  }
}
