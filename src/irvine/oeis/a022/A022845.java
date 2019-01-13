package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022845.
 * @author Sean A. Irvine
 */
public class A022845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022845() {
    super(new long[] {-450, 635, -209, 25}, new long[] {1, 25, 416, 5810});
  }
}
