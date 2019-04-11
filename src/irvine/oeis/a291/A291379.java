package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291379 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= 1 -</code> S^4.
 * @author Sean A. Irvine
 */
public class A291379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291379() {
    super(new long[] {1, 4, 6, 4, 1, 0, 0, 0}, new long[] {0, 0, 0, 1, 4, 6, 4, 2});
  }
}
