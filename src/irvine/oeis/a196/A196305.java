package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196305 <code>a(n) = 15*2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A196305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196305() {
    super(new long[] {-2, 3}, new long[] {14, 29});
  }
}
