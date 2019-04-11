package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214733 <code>a(n) = -a(n-1) - 3*a(n-2)</code> with <code>n&gt;1, a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A214733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214733() {
    super(new long[] {-3, -1}, new long[] {0, 1});
  }
}
