package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156194 Period 12: 1,2,7,1,7,2,1,1,4,2,4,1 repeated.
 * @author Sean A. Irvine
 */
public class A156194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156194() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 7, 1, 7, 2, 1, 1, 4, 2, 4, 1});
  }
}
