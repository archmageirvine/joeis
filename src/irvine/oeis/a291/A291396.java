package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291396 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= (1 -</code> S)(1 <code>- 2</code> S)(1 <code>- 3</code> S).
 * @author Sean A. Irvine
 */
public class A291396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291396() {
    super(new long[] {6, 18, 7, -16, -5, 6}, new long[] {6, 31, 140, 596, 2440, 9751});
  }
}
