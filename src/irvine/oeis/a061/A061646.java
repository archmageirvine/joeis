package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061646 <code>a(n) = 2*a(n-1) + 2*a(n-2) - a(n-3)</code> with <code>a(-1) = 1, a(0) = 1, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A061646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061646() {
    super(new long[] {-1, 2, 2}, new long[] {1, 1, 1});
  }
}
