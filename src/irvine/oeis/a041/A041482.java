package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041482 Numerators of continued fraction convergents to <code>sqrt(258)</code>.
 * @author Sean A. Irvine
 */
public class A041482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041482() {
    super(new long[] {-1, 0, 514, 0}, new long[] {16, 257, 8240, 132097});
  }
}
