package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153596 a(n) = ((5 + sqrt(3))^n - (5 - sqrt(3))^n)/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A153596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153596() {
    super(new long[] {-22, 10}, new long[] {1, 10});
  }
}
