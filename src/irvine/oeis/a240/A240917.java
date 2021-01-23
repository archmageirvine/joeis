package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240917 a(n) = 2*3^(2*n) - 3*3^n + 1.
 * @author Sean A. Irvine
 */
public class A240917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240917() {
    super(new long[] {27, -39, 13}, new long[] {0, 10, 136});
  }
}
