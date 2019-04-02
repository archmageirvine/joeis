package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259109 2*A000540.
 * @author Sean A. Irvine
 */
public class A259109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259109() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 2, 130, 1588, 9780, 41030, 134342, 369640});
  }
}
