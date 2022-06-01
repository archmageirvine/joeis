package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016862 a(n) = (5*n + 1)^2.
 * @author Sean A. Irvine
 */
public class A016862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016862() {
    super(new long[] {1, -3, 3}, new long[] {1, 36, 121});
  }
}
