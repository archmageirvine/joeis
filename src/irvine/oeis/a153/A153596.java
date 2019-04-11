package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153596 <code>a(n) = ((5 + sqrt(3))^n - (5 - sqrt(3))^n)/(2*sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A153596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153596() {
    super(new long[] {-22, 10}, new long[] {1, 10});
  }
}
