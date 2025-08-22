package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152041 a(n) = A008893(n)/2.
 * @author Sean A. Irvine
 */
public class A152041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152041() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 33, 129, 355});
  }
}
