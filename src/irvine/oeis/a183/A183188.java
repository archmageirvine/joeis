package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183188 <code>a(n) = 3*a(n-1) + a(n-3)</code> with <code>a(0)=1, a(1)=2, a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A183188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183188() {
    super(new long[] {1, 0, 3}, new long[] {1, 2, 6});
  }
}
