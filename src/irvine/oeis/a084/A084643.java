package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084643 <code>a(n) = 3^(n-1)*(2*n-3) + 2^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A084643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084643() {
    super(new long[] {18, -21, 8}, new long[] {1, 3, 11});
  }
}
