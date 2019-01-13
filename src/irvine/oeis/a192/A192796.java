package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192796.
 * @author Sean A. Irvine
 */
public class A192796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192796() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 28, 132, 360});
  }
}
