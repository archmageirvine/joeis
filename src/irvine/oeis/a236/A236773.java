package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236773 a(n) = n + floor( n^2/2 + n^3/3 ).
 * @author Sean A. Irvine
 */
public class A236773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236773() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 1, -3, 3}, new long[] {0, 1, 6, 16, 33, 59, 96, 145, 210});
  }
}
