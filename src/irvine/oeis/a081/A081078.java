package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081078 a(n) = Lucas(4n) - 3, or Lucas(2n-1)*Lucas(2n+1).
 * @author Sean A. Irvine
 */
public class A081078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081078() {
    super(new long[] {1, -8, 8}, new long[] {4, 44, 319});
  }
}
