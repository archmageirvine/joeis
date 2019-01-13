package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128965.
 * @author Sean A. Irvine
 */
public class A128965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128965() {
    super(new long[] {-2401, 1372, -294, 28}, new long[] {0, 294, 8232, 144060});
  }
}
