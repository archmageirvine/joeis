package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292402 p-INVERT of <code>(1,0,0,1,0,0,0,0,0,0,</code>...), where p(S) <code>= 1 -</code> S^2.
 * @author Sean A. Irvine
 */
public class A292402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292402() {
    super(new long[] {1, 0, 0, 2, 0, 0, 1, 0}, new long[] {0, 1, 0, 1, 2, 1, 4, 2});
  }
}
