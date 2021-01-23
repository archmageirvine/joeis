package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083425 a(n) = (5*5^n + (-1)^n)/6.
 * @author Sean A. Irvine
 */
public class A083425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083425() {
    super(new long[] {5, 4}, new long[] {1, 4});
  }
}
