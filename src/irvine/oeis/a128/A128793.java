package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128793.
 * @author Sean A. Irvine
 */
public class A128793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128793() {
    super(new long[] {-2401, 1372, -294, 28}, new long[] {0, 7, 392, 9261});
  }
}
