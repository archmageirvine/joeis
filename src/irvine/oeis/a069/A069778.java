package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069778 q-factorial numbers 3!_q.
 * @author Sean A. Irvine
 */
public class A069778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069778() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 6, 21, 52});
  }
}
