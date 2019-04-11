package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291242 p-INVERT of <code>(0,1,0,1,0,1,...),</code> where p(S) <code>= 1 - 2</code> S - S^2 + S^3.
 * @author Sean A. Irvine
 */
public class A291242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291242() {
    super(new long[] {1, 2, -4, -5, 4, 2}, new long[] {2, 5, 13, 35, 91, 241});
  }
}
