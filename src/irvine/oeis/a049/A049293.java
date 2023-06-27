package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049293 Number of subgroups of index 3 in fundamental group of a closed surface of characteristic -n.
 * @author Sean A. Irvine
 */
public class A049293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049293() {
    super(-2, new long[] {-36, 72, -47, 12}, new long[] {0, 0, 4, 34});
  }
}
