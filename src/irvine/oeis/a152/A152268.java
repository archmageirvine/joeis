package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152268 A hidden Markov recursion involving the matrices: <code>M0 = {{0, 1}, {1, 1/2}}; M = {{0, 2}, {2, 1}}</code>; as <code>Mh=M0.M.(M0+I); v[(n)=Mh.v(n-1)</code>: first element of v.
 * @author Sean A. Irvine
 */
public class A152268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152268() {
    super(new long[] {-8, 7}, new long[] {0, 1});
  }
}
