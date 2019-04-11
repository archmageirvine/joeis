package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165310 <code>a(0)=1, a(1)=3, a(n) = 7*a(n-1) - 9*a(n-2)</code> for <code>n &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A165310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165310() {
    super(new long[] {-9, 7}, new long[] {1, 3});
  }
}
