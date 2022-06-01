package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240525 2^(n-2)*(2^(n+4)-(-1)^n+5).
 * @author Sean A. Irvine
 */
public class A240525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240525() {
    super(new long[] {-16, 4, 4}, new long[] {5, 19, 68});
  }
}
