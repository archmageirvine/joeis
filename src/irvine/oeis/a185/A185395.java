package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185395 <code>a(3n) = n^2, a(3n+1) = a(3n+2) = 3*n*(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A185395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185395() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {0, 0, 0, 1, 3, 3, 4, 9, 9});
  }
}
