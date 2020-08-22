package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165759 a(n) = (7-4*7^n)/3.
 * @author Sean A. Irvine
 */
public class A165759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165759() {
    super(new long[] {-7, 8}, new long[] {1, -7});
  }
}
