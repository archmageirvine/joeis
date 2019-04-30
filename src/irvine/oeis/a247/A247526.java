package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247526 <code>a(n) = L(n+1) * L(n) * L(n-1) * L(n-2) / 6</code>, where <code>L(n) =</code> Lucas numbers (A000032).
 * @author Sean A. Irvine
 */
public class A247526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247526() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-1, -1, 4, 14, 154});
  }
}
