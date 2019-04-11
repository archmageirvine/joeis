package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291405 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= 1 - 2</code> S^2 <code>- 2</code> S^4.
 * @author Sean A. Irvine
 */
public class A291405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291405() {
    super(new long[] {2, 8, 12, 8, 4, 4, 2, 0}, new long[] {0, 2, 4, 8, 24, 52, 120, 290});
  }
}
