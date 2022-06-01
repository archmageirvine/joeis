package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240526 2^(n-2)*(2^(n+4)-(-1)^n+13).
 * @author Sean A. Irvine
 */
public class A240526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240526() {
    super(new long[] {-16, 4, 4}, new long[] {7, 23, 76});
  }
}
