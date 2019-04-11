package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291240 p-INVERT of <code>(0,1,0,1,0,1,...),</code> where p(S) <code>= (1 -</code> S^3)^2.
 * @author Sean A. Irvine
 */
public class A291240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291240() {
    super(new long[] {-1, 0, 6, -2, -15, 6, 19, -6, -15, 2, 6, 0}, new long[] {0, 0, 2, 0, 6, 3, 12, 18, 24, 63, 66, 173});
  }
}
