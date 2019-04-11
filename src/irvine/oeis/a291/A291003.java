package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291003 p-INVERT of <code>(1,1,1,1,1,...),</code> where p(S) <code>= (1 -</code> S)(1 - 2*S)(1 - 3*S)(1 - 4*S).
 * @author Sean A. Irvine
 */
public class A291003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291003() {
    super(new long[] {-120, 154, -71, 14}, new long[] {10, 75, 490, 2956});
  }
}
