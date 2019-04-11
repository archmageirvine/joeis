package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168197 <code>a(n) = 3*n - a(n-1) + 1</code> with <code>n &gt; 1, a(1)=0</code>.
 * @author Sean A. Irvine
 */
public class A168197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168197() {
    super(new long[] {-1, 1, 1}, new long[] {0, 7, 3});
  }
}
