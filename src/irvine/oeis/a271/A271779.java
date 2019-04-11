package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271779 <code>a(n) = n^3 + 2*n^2 + 5*n + 11</code>.
 * @author Sean A. Irvine
 */
public class A271779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271779() {
    super(new long[] {-1, 4, -6, 4}, new long[] {11, 19, 37, 71});
  }
}
