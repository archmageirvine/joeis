package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254136 Indices of pentagonal numbers (A000326) which are also centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A254136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254136() {
    super(1, new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 73, 889, 84049, 1025713});
  }
}
