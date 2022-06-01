package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152269 A switched hidden Markov recursion involving the matrices: M0 = {{0, 1}, {1, 1/2}}; M = {{0, 2}, {2, 1}}; as Mh=M0.M.(M0+I*mod[n.2]); v[(n)=Mh.v(n-1): first element of v.
 * @author Sean A. Irvine
 */
public class A152269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152269() {
    super(new long[] {32, 0, -5, 0}, new long[] {0, 1, -3, -13});
  }
}
