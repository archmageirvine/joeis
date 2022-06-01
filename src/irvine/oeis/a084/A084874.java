package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084874 Number of (k,m,n)-antichains of multisets with k=3 and m=2.
 * @author Sean A. Irvine
 */
public class A084874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084874() {
    super(new long[] {162, -99, 18}, new long[] {0, 0, 9});
  }
}
