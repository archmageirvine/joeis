package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198769 (9*5^n-1)/4.
 * @author Sean A. Irvine
 */
public class A198769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198769() {
    super(new long[] {-5, 6}, new long[] {2, 11});
  }
}
