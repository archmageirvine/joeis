package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209084 a(n) = 2*a(n-1) + 4*a(n-2) with n&gt;1, a(0)=0, a(1)=4.
 * @author Sean A. Irvine
 */
public class A209084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209084() {
    super(new long[] {4, 2}, new long[] {0, 4});
  }
}
