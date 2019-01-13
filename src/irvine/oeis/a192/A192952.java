package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192952.
 * @author Sean A. Irvine
 */
public class A192952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192952() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 2, 7});
  }
}
