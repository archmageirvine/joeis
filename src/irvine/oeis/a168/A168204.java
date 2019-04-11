package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168204 <code>a(n) = 4*n - a(n-1) + 1</code> with <code>n&gt;1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A168204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168204() {
    super(new long[] {-1, 1, 1}, new long[] {1, 8, 5});
  }
}
