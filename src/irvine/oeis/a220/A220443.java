package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220443 <code>a(n) =</code> Sum_{i=1..n} (3i)^2.
 * @author Sean A. Irvine
 */
public class A220443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220443() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 9, 45, 126});
  }
}
