package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084880 Number of (k,m,n)-multiantichains of multisets with k=3 and m=3.
 * @author Sean A. Irvine
 */
public class A084880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084880() {
    super(new long[] {-1102248, 854388, -242514, 32895, -2277, 77}, new long[] {1, 3, 28, 701, 28156, 1105553});
  }
}
