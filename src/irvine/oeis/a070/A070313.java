package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070313 <code>a(n) = 2^n - (2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A070313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070313() {
    super(new long[] {2, -5, 4}, new long[] {0, -1, -1});
  }
}
