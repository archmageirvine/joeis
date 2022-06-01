package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168332 a(n) = 6 + 7 * floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A168332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168332() {
    super(new long[] {-1, 1, 1}, new long[] {6, 6, 13});
  }
}
