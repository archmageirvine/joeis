package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017345 a(n) = (10*n + 6)^5.
 * @author Sean A. Irvine
 */
public class A017345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017345() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7776, 1048576, 11881376, 60466176, 205962976, 550731776});
  }
}
