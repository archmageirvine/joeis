package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168233 a(n) = 3*n - a(n-1) - 1 for n&gt;0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A168233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168233() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 4});
  }
}
