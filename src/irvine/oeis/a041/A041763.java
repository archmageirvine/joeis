package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041763 Denominators of continued fraction convergents to <code>sqrt(402)</code>.
 * @author Sean A. Irvine
 */
public class A041763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041763() {
    super(new long[] {-1, 0, 802, 0}, new long[] {1, 20, 801, 16040});
  }
}
