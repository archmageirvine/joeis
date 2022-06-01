package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124342 Expansion of (1+x)/(1+2x-2x^3).
 * @author Sean A. Irvine
 */
public class A124342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124342() {
    super(new long[] {2, 0, -2}, new long[] {1, -1, 2});
  }
}
