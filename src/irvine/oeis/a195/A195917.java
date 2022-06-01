package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195917 Numbers k such that both k+1 and 7k+1 are squares.
 * @author Sean A. Irvine
 */
public class A195917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195917() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {0, 24, 120, 6240, 30624});
  }
}
