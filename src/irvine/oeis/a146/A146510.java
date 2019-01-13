package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146510.
 * @author Sean A. Irvine
 */
public class A146510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146510() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 16});
  }
}
