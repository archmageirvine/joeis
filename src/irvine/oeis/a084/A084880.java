package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084880 Number of <code>(k,m,n)-multiantichains</code> of multisets with <code>k=3</code> and <code>m=3</code>.
 * @author Sean A. Irvine
 */
public class A084880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084880() {
    super(new long[] {-1102248, 854388, -242514, 32895, -2277, 77}, new long[] {1, 3, 28, 701, 28156, 1105553});
  }
}
