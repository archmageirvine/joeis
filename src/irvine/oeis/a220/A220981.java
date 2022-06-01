package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220981 6^(4n+2) - 6^(3n+2) + 3 * 6^(2n+1) - 6^(n+1) + 1: the left Aurifeuillian factor of 6^(12n+6) + 1.
 * @author Sean A. Irvine
 */
public class A220981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220981() {
    super(new long[] {60466176, -72550080, 12427560, -345210, 1555}, new long[] {13, 39493, 58809673, 78002205553L, 101481622729633L});
  }
}
