package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278475 a(n) = floor(phi^7*a(n-1)) for n&gt;0, a(0) = 1, where phi is the golden ratio (A001622).
 * @author Sean A. Irvine
 */
public class A278475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278475() {
    super(new long[] {-1, -28, 30}, new long[] {1, 29, 841});
  }
}
