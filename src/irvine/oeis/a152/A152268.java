package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152268 A hidden Markov recursion involving the matrices: M0 <code>= {{0, 1}, {1, 1/2}}</code>; M <code>= {{0, 2}, {2, 1}}</code>; as Mh=M0.M.(M0+I); v[(n)=Mh.v(n-1): first element of v.
 * @author Sean A. Irvine
 */
public class A152268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152268() {
    super(new long[] {-8, 7}, new long[] {0, 1});
  }
}
