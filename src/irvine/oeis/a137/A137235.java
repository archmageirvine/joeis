package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137235 <code>a(n) = (n+1)/2</code> if n is odd; <code>a(n) = n/2 + 6</code> if n is even.
 * @author Sean A. Irvine
 */
public class A137235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137235() {
    super(new long[] {-1, 1, 1}, new long[] {6, 1, 7});
  }
}
