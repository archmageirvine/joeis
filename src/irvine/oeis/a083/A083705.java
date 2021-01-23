package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083705 a(n) = 2*a(n-1) - 1 with a(0)=10.
 * @author Sean A. Irvine
 */
public class A083705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083705() {
    super(new long[] {-2, 3}, new long[] {10, 19});
  }
}
