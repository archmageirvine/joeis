package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017169 a(n) = (9*n)^9.
 * @author Sean A. Irvine
 */
public class A017169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017169() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 387420489, 198359290368L, 7625597484987L, 101559956668416L, 756680642578125L, 3904305912313344L, 15633814156853823L, 51998697814228992L, 150094635296999121L});
  }
}
