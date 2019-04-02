package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173262 a(n) = (2*10^n+61)/9.
 * @author Sean A. Irvine
 */
public class A173262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173262() {
    super(new long[] {-10, 11}, new long[] {9, 29});
  }
}
