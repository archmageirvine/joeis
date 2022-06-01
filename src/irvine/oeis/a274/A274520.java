package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274520 a(n) = ((1 + sqrt(7))^n - (1 - sqrt(7))^n)/sqrt(7).
 * @author Sean A. Irvine
 */
public class A274520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274520() {
    super(new long[] {6, 2}, new long[] {0, 2});
  }
}
