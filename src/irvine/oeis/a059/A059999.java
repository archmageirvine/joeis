package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059999 a(n) = (1/6)*n^5 - (19/8)*n^4 + (51/4)*n^3 - (253/8)*n^2 + (445/12)*n - 14.
 * @author Sean A. Irvine
 */
public class A059999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059999() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 3, 5, 7, 11, 42});
  }
}
