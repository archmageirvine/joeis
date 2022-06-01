package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261399 a(1)=1; thereafter a(n) = (2/5)*(9*6^(n-2)+1).
 * @author Sean A. Irvine
 */
public class A261399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261399() {
    super(new long[] {-6, 7}, new long[] {1, 4});
  }
}
