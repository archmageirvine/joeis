package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167498 a(n) = 6+32*n^2+8*n*(7+8*n^2)/3.
 * @author Sean A. Irvine
 */
public class A167498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167498() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 78, 342, 926});
  }
}
