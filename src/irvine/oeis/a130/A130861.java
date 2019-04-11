package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130861 <code>a(n) = (n-1)*(2*n+5)</code>.
 * @author Sean A. Irvine
 */
public class A130861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130861() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 22});
  }
}
