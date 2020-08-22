package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164594 a(n) = ((5 + sqrt(18))*(4 + sqrt(8))^n + (5 - sqrt(18))*(4 - sqrt(8))^n)/2.
 * @author Sean A. Irvine
 */
public class A164594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164594() {
    super(new long[] {-8, 8}, new long[] {5, 32});
  }
}
