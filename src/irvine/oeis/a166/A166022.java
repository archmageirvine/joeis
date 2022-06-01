package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166022 a(n) = 3*a(n-1) -2*a(n-2) -a(n-3) +3*a(n-4) -2*a(n-5) for n &gt; 4, with initial values as shown.
 * @author Sean A. Irvine
 */
public class A166022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166022() {
    super(new long[] {-2, 3, -1, -2, 3}, new long[] {0, 1, 2, 2, 4});
  }
}
