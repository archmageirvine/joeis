package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153594 <code>a(n) = ((4 + sqrt(3))^n - (4 - sqrt(3))^n)/(2*sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A153594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153594() {
    super(new long[] {-13, 8}, new long[] {1, 8});
  }
}
