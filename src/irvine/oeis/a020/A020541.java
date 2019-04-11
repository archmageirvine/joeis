package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020541 <code>a(n) =</code> 4th Chebyshev polynomial (second kind) evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020541() {
    super(new long[] {64, -84, 21}, new long[] {5, 209, 3905});
  }
}
