package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217838 Number of n element 0..1 arrays with each element the minimum of 7 adjacent elements of a random 0..1 array of n+6 elements.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A217838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217838() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 2, 4, 7, 11, 16, 22, 29});
  }
}
