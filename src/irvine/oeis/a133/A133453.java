package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133453 <code>a(n)=3a(n-1)-a(n-3)+3a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A133453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133453() {
    super(new long[] {3, -1, 0, 3}, new long[] {2, 4, 13, 40});
  }
}
