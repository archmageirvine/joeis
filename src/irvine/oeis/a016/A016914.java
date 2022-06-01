package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016914 a(n) = (6*n)^6.
 * @author Sean A. Irvine
 */
public class A016914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016914() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 46656, 2985984, 34012224, 191102976, 729000000, 2176782336L});
  }
}
