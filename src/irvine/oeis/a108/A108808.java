package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108808 Number of compositions of grid graph G_{3,n} = P_3 X P_n.
 * @author Sean A. Irvine
 */
public class A108808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108808() {
    super(1, new long[] {-4, 6, 91, -75, 23}, new long[] {4, 74, 1434, 27780, 538150});
  }
}
