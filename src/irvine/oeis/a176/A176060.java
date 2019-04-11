package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176060 <code>a(n) = n*(n+1)*(3*n^2+5*n+4)/12</code>.
 * @author Sean A. Irvine
 */
public class A176060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176060() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 13, 46, 120});
  }
}
