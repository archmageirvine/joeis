package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274520 <code>a(n) = ((1 + sqrt(7))^n - (1 - sqrt(7))^n)/sqrt(7)</code>.
 * @author Sean A. Irvine
 */
public class A274520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274520() {
    super(new long[] {6, 2}, new long[] {0, 2});
  }
}
