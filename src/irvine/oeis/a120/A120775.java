package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120775 The (3,1)-entry of the matrix M^n, where M is the 3 X 3 matrix [0,1,1; 2,1,2; 1,2,2] (n&gt;=1).
 * @author Sean A. Irvine
 */
public class A120775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120775() {
    super(new long[] {1, 5, 3}, new long[] {1, 6, 23});
  }
}
