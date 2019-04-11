package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167469 <code>a(n) = 3*n*(5*n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A167469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167469() {
    super(new long[] {1, -3, 3}, new long[] {6, 27, 63});
  }
}
