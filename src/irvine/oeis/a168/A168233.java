package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168233 <code>a(n) = 3*n - a(n-1) - 1</code> for <code>n&gt;0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A168233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168233() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 4});
  }
}
