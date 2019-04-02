package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168460 a(n) = 6 + 10*floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A168460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168460() {
    super(new long[] {-1, 1, 1}, new long[] {6, 6, 16});
  }
}
