package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154591 <code>a(n) = 2*n^2 + 18*n + 7</code>.
 * @author Sean A. Irvine
 */
public class A154591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154591() {
    super(new long[] {1, -3, 3}, new long[] {27, 51, 79});
  }
}
