package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156158 a(n) = 6*a(n-1)-a(n-2) for n &gt; 2; a(1) = 25, a(2) = 137.
 * @author Sean A. Irvine
 */
public class A156158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156158() {
    super(new long[] {-1, 6}, new long[] {25, 137});
  }
}
