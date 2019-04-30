package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084222 <code>a(n) = -2*a(n-1) + 3*a(n-2)</code>, with <code>a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A084222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084222() {
    super(new long[] {3, -2}, new long[] {1, 2});
  }
}
