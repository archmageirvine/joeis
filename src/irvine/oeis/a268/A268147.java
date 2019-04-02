package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268147 A double binomial sum involving absolute values.
 * @author Sean A. Irvine
 */
public class A268147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268147() {
    super(new long[] {-256, 32}, new long[] {0, 16});
  }
}
