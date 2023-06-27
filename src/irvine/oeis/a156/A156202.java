package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156202 a(n) = 2*a(n-1)+3 for n &gt; 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A156202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156202() {
    super(1, new long[] {-2, 3}, new long[] {10, 23});
  }
}
