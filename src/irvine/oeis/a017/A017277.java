package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017277 a(n) = (10*n)^9.
 * @author Sean A. Irvine
 */
public class A017277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017277() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1000000000, 512000000000L, 19683000000000L, 262144000000000L, 1953125000000000L, 10077696000000000L, 40353607000000000L, 134217728000000000L, 387420489000000000L});
  }
}
