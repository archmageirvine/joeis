package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022998 If n is odd then n else <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A022998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022998() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 4, 3});
  }
}
