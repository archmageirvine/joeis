package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172175 a(n) = 110*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A172175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172175() {
    super(new long[] {-110, 111}, new long[] {1, 111});
  }
}
