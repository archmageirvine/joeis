package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153497 a(n) is the number whose binary expansion is A153498(n).
 * @author Sean A. Irvine
 */
public class A153497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153497() {
    super(1, new long[] {-64, 80, -56, 50, -14, 5}, new long[] {1, 7, 21, 73, 341, 1453});
  }
}
