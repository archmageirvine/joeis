package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100413 Numbers k such that k is reversal(k)-th even composite number (k is A004086(k)-th even composite number).
 * @author Sean A. Irvine
 */
public class A100413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100413() {
    super(new long[] {-10, 11}, new long[] {52, 592});
  }
}
