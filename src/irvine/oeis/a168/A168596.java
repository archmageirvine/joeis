package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168596 <code>a(n) = 2*a(n-1) - 1</code> with <code>a(0)=14</code>.
 * @author Sean A. Irvine
 */
public class A168596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168596() {
    super(new long[] {-2, 3}, new long[] {14, 27});
  }
}
