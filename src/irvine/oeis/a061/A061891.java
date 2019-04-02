package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061891 a(0) = 1; for n&gt;0, a(n) = a(n-1) if n is already in the sequence, a(n) = a(n-1) + 3 otherwise.
 * @author Sean A. Irvine
 */
public class A061891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061891() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 4, 7});
  }
}
