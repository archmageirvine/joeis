package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291381 p-INVERT of <code>(1,1,0,0,0,0,...),</code> where p(S) <code>= 1 -</code> S^6.
 * @author Sean A. Irvine
 */
public class A291381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291381() {
    super(new long[] {1, 6, 15, 20, 15, 6, 1, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1, 6, 15, 20, 15, 6, 2});
  }
}
