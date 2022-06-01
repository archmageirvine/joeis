package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089594 Alternating sum of squares to n.
 * @author Sean A. Irvine
 */
public class A089594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089594() {
    super(new long[] {-1, -3, -3}, new long[] {-1, 3, -6});
  }
}
