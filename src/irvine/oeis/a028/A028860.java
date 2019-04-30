package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028860 <code>a(n+2) = 2*a(n+1) + 2*a(n); a(0) = -1, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A028860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028860() {
    super(new long[] {2, 2}, new long[] {-1, 1});
  }
}
