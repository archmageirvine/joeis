package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069779 q-factorial numbers 4!_q.
 * @author Sean A. Irvine
 */
public class A069779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069779() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 24, 315, 2080, 8925, 29016, 77959});
  }
}
