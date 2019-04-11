package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017115 <code>a(n) = (8*n + 4)^3</code>.
 * @author Sean A. Irvine
 */
public class A017115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017115() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 1728, 8000, 21952});
  }
}
