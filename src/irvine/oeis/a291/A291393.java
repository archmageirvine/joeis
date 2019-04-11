package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291393 p-INVERT of <code>(1,1,0,0,0,0,...),</code> where p(S) <code>= (1 -</code> S)(1 <code>- 2</code> S).
 * @author Sean A. Irvine
 */
public class A291393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291393() {
    super(new long[] {-2, -4, 1, 3}, new long[] {3, 10, 29, 83});
  }
}
