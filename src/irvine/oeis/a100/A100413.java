package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100413 Numbers n such that n is reversal(n)-th even composite number (n is A004086(n)-th even composite number).
 * @author Sean A. Irvine
 */
public class A100413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100413() {
    super(new long[] {-10, 11}, new long[] {52, 592});
  }
}
