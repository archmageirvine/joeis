package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268151 A double binomial sum involving absolute values.
 * @author Sean A. Irvine
 */
public class A268151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268151() {
    super(new long[] {4096, -768, 48}, new long[] {0, 40, 2816});
  }
}
