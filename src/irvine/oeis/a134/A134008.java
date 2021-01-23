package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134008 a(n) = 1^n + 3^n + 5^n + 7^n + 9^n + 11^n.
 * @author Sean A. Irvine
 */
public class A134008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134008() {
    super(new long[] {-10395, 19524, -12139, 3480, -505, 36}, new long[] {6, 36, 286, 2556, 24310, 240276});
  }
}
