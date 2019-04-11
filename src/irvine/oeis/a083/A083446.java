package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083446 <code>a(n) = ((10^n - 1) - 9^n)/9</code>.
 * @author Sean A. Irvine
 */
public class A083446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083446() {
    super(new long[] {90, -109, 20}, new long[] {2, 30, 382});
  }
}
