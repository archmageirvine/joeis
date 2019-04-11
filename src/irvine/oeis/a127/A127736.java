package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127736 <code>a(n) = n*(n^2+2*n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A127736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127736() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 21, 46});
  }
}
