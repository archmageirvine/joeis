package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291730 p-INVERT of <code>(1,0,1,0,0,0,0,...),</code> where p(S) <code>= 1 - 2</code> S <code>- 2</code> S^2.
 * @author Sean A. Irvine
 */
public class A291730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291730() {
    super(new long[] {2, 0, 4, 2, 2, 2}, new long[] {2, 6, 18, 56, 168, 510});
  }
}
