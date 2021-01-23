package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017286 a(n) = (10*n + 1)^6.
 * @author Sean A. Irvine
 */
public class A017286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017286() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 1771561, 85766121, 887503681, 4750104241L, 17596287801L, 51520374361L});
  }
}
