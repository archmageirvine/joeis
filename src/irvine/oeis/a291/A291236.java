package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291236 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where p(S) <code>= (1 -</code> S)(1 <code>- 3</code> S).
 * @author Sean A. Irvine
 */
public class A291236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291236() {
    super(new long[] {-1, -4, -1, 4}, new long[] {4, 13, 44, 147});
  }
}
