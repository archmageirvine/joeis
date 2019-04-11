package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290921 p-INVERT of the positive integers, where p(S) <code>= (1 -</code> S)^6.
 * @author Sean A. Irvine
 */
public class A290921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290921() {
    super(new long[] {-1, 18, -141, 630, -1770, 3258, -3989, 3258, -1770, 630, -141, 18}, new long[] {6, 33, 158, 696, 2886, 11425, 43590, 161355, 582340, 2056818, 7130388, 24319054});
  }
}
