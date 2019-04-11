package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163613 <code>a(n) = ((1 + 3*sqrt(2))*(2 + sqrt(2))^n + (1 - 3*sqrt(2))*(2 - sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A163613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163613() {
    super(new long[] {-2, 4}, new long[] {1, 8});
  }
}
