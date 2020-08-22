package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106328 Numbers j such that 8*(j^2) + 9 = k^2 for some positive number k.
 * @author Sean A. Irvine
 */
public class A106328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106328() {
    super(new long[] {-1, 6}, new long[] {0, 3});
  }
}
