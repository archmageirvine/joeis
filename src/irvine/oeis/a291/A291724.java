package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291724 p-INVERT of <code>(1,0,1,0,0,0,0,...),</code> where p(S) <code>= 1 -</code> S^5.
 * @author Sean A. Irvine
 */
public class A291724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291724() {
    super(new long[] {1, 0, 5, 0, 10, 0, 10, 0, 5, 0, 1, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 1, 0, 5, 0, 10, 1, 10, 10, 5, 45, 2});
  }
}
