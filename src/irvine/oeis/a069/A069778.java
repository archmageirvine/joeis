package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069778 q-factorial numbers <code>3!_q</code>.
 * @author Sean A. Irvine
 */
public class A069778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069778() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 6, 21, 52});
  }
}
