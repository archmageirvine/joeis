package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026067.
 * @author Sean A. Irvine
 */
public class A026067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026067() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {52, 84, 123, 170, 225, 290, 364});
  }
}
