package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017391 a(n) = (11*n)^3.
 * @author Sean A. Irvine
 */
public class A017391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017391() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1331, 10648, 35937});
  }
}
