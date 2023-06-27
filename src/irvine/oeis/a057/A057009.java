package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057009 Number of conjugacy classes of subgroups of index 3 in free group of rank n.
 * @author Sean A. Irvine
 */
public class A057009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057009() {
    super(1, new long[] {36, -36, 11}, new long[] {1, 7, 41});
  }
}
