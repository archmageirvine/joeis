package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153593 <code>a(n) = ((9 + sqrt(2))^n - (9 - sqrt(2))^n)/(2*sqrt(2))</code>.
 * @author Sean A. Irvine
 */
public class A153593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153593() {
    super(new long[] {-79, 18}, new long[] {1, 18});
  }
}
