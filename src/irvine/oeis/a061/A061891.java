package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061891 <code>a(0) = 1;</code> for <code>n&gt;0, a(n) = a(n-1)</code> if n is already in the sequence, <code>a(n) = a(n-1) + 3</code> otherwise.
 * @author Sean A. Irvine
 */
public class A061891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061891() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 4, 7});
  }
}
