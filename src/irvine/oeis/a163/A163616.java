package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163616 a(n) = ((1 + 3*sqrt(2))*(5 + sqrt(2))^n + (1 - 3*sqrt(2))*(5 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163616() {
    super(new long[] {-23, 10}, new long[] {1, 11});
  }
}
