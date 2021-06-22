package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154348 a(n) = 16*a(n-1) - 56*a(n-2) for n&gt;1, with a(0)=1, a(1)=16.
 * @author Sean A. Irvine
 */
public class A154348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154348() {
    super(new long[] {-56, 16}, new long[] {1, 16});
  }
}
