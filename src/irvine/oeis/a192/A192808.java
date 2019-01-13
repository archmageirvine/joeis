package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192808.
 * @author Sean A. Irvine
 */
public class A192808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192808() {
    super(new long[] {8, -12, 7}, new long[] {1, 2, 6});
  }
}
