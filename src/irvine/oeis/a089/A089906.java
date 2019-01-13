package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089906.
 * @author Sean A. Irvine
 */
public class A089906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089906() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 10, 270, 4650});
  }
}
