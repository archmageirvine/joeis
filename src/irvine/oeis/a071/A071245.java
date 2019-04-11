package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071245 <code>a(n) = n*(n-1)*(2*n^2+1)/6</code>.
 * @author Sean A. Irvine
 */
public class A071245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071245() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 3, 19, 66});
  }
}
