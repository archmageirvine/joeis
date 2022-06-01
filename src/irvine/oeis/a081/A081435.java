package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081435 Diagonal in array of n-gonal numbers A081422.
 * @author Sean A. Irvine
 */
public class A081435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081435() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 18, 46});
  }
}
