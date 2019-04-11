package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168459 <code>a(n) = (10*n + 5*(-1)^n - 3)/2</code>.
 * @author Sean A. Irvine
 */
public class A168459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168459() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 11});
  }
}
