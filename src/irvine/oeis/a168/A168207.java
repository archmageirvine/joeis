package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168207 <code>a(n) = 5*n - a(n-1) + 1</code> with <code>n&gt;1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A168207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168207() {
    super(new long[] {-1, 1, 1}, new long[] {2, 14, 7});
  }
}
