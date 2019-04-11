package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094200 <code>a(n)=16*n^4+32*n^3+36*n^2+20*n+3</code>.
 * @author Sean A. Irvine
 */
public class A094200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094200() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 107, 699, 2547, 6803});
  }
}
