package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078522 Numbers k such that (k+1)*(2*k+1) is a perfect square.
 * @author Sean A. Irvine
 */
public class A078522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078522() {
    super(1, new long[] {1, -35, 35}, new long[] {0, 24, 840});
  }
}
