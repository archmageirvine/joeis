package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277977 <code>a(n) = n*(1-3n+2*n^2+2*n^3)/2</code>.
 * @author Sean A. Irvine
 */
public class A277977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277977() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 19, 96, 298});
  }
}
