package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261032 a(n) = (-1)^n*(n^8 + 4*n^7 - 14*n^5 + 28*n^3 - 17*n)/2.
 * @author Sean A. Irvine
 */
public class A261032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261032() {
    super(new long[] {-1, -9, -36, -84, -126, -126, -84, -36, -9}, new long[] {0, -1, 255, -6306, 59230, -331395, 1348221, -4416580, 12360636});
  }
}
