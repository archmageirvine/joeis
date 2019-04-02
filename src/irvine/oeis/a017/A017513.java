package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017513 a(n) = (11*n+10)^5.
 * @author Sean A. Irvine
 */
public class A017513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017513() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {100000, 4084101, 33554432, 147008443, 459165024, 1160290625});
  }
}
