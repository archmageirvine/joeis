package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017298 a(n) = (10*n + 2)^6.
 * @author Sean A. Irvine
 */
public class A017298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017298() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 2985984, 113379904, 1073741824, 5489031744L, 19770609664L, 56800235584L});
  }
}
