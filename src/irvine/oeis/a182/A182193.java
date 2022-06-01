package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182193 Sequence of row differences related to table A182355.
 * @author Sean A. Irvine
 */
public class A182193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182193() {
    super(new long[] {1, -7, 7}, new long[] {-1, 1, 19});
  }
}
