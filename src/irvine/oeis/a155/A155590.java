package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155590 a(n) = 7^n+2^n-1^n.
 * @author Sean A. Irvine
 */
public class A155590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155590() {
    super(new long[] {14, -23, 10}, new long[] {1, 8, 52});
  }
}
