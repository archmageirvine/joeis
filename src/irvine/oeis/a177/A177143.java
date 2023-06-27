package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177143 Pasquale's sequence: a(n) = 2a(n-1) + (-1)^n*floor(n/2), with a(1)=1.
 * @author Sean A. Irvine
 */
public class A177143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177143() {
    super(1, new long[] {-2, -1, 3, 1}, new long[] {1, 3, 5, 12});
  }
}
