package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017517 a(n) = (11*n + 10)^9.
 * @author Sean A. Irvine
 */
public class A017517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017517() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1000000000, 794280046581L, 35184372088832L, 502592611936843L, 3904305912313344L, 20711912837890625L, 84590643846578176L, 285544154243029527L, 833747762130149888L, 2171893279442309389L});
  }
}
