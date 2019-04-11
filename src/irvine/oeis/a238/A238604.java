package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238604 <code>a(n) =</code> Sum_{k=0..3} f(n+k)^2 where f=A130519.
 * @author Sean A. Irvine
 */
public class A238604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238604() {
    super(new long[] {1, -3, 3, -1, -2, 6, -6, 2, 1, -3, 3}, new long[] {0, 1, 5, 14, 30, 65, 125, 216, 344, 533, 793});
  }
}
