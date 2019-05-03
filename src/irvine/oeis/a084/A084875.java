package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084875 Number of <code>(k,m,n)-antichains</code> of multisets with <code>k=3</code> and <code>m=3</code>.
 * @author Sean A. Irvine
 */
public class A084875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084875() {
    super(new long[] {-1102248, 854388, -242514, 32895, -2277, 77}, new long[] {0, 0, 1, 350, 24025, 1061570});
  }
}
