package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291409 p-INVERT of (1,1,0,0,0,0,...), where p(S) = (1 - S^2)(1 - S)^2.
 * @author Sean A. Irvine
 */
public class A291409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291409() {
    super(new long[] {1, 4, 4, -2, -5, -2, 2, 2}, new long[] {2, 6, 14, 31, 66, 136, 272, 534});
  }
}
