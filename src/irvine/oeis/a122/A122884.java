package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122884 The (2,3)-entry in the n-th power of the 3 X 3 matrix M = [1,1,1; 4,2,1; 9,3,1].
 * @author Sean A. Irvine
 */
public class A122884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122884() {
    super(1, new long[] {-2, 11, 4}, new long[] {1, 7, 39});
  }
}
