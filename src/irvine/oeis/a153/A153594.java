package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153594 a(n) = ((4 + sqrt(3))^n - (4 - sqrt(3))^n)/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A153594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153594() {
    super(1, new long[] {-13, 8}, new long[] {1, 8});
  }
}
