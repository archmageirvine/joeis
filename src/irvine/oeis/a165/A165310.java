package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165310 a(0)=1, a(1)=3, a(n) = 7*a(n-1) - 9*a(n-2) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A165310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165310() {
    super(new long[] {-9, 7}, new long[] {1, 3});
  }
}
