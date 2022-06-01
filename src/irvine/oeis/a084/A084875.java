package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084875 Number of (k,m,n)-antichains of multisets with k=3 and m=3.
 * @author Sean A. Irvine
 */
public class A084875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084875() {
    super(new long[] {-1102248, 854388, -242514, 32895, -2277, 77}, new long[] {0, 0, 1, 350, 24025, 1061570});
  }
}
