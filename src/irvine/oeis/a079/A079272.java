package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079272 a(n) = ((2n+1)*3^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A079272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079272() {
    super(new long[] {9, -15, 7}, new long[] {4, 22, 94});
  }
}
