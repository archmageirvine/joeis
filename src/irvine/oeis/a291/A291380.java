package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291380 p-INVERT of <code>(1,1,0,0,0,0,...),</code> where p(S) <code>= 1 -</code> S^5.
 * @author Sean A. Irvine
 */
public class A291380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291380() {
    super(new long[] {1, 5, 10, 10, 5, 1, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 1, 5, 10, 10, 5, 2});
  }
}
