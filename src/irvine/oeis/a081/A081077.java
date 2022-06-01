package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081077 a(n) = Lucas(4*n+2) + 3, or Lucas(2*n)*Lucas(2*n+2).
 * @author Sean A. Irvine
 */
public class A081077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081077() {
    super(new long[] {1, -8, 8}, new long[] {6, 21, 126});
  }
}
