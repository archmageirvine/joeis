package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291218 p-INVERT of <code>(0,1,0,1,0,1,</code>...), where p(S) <code>= 1 -</code> S^5.
 * @author Sean A. Irvine
 */
public class A291218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291218() {
    super(new long[] {1, 0, -5, 0, 10, 1, -10, 0, 5, 0}, new long[] {0, 0, 0, 0, 1, 0, 5, 0, 15, 1});
  }
}
