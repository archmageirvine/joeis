package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192812.
 * @author Sean A. Irvine
 */
public class A192812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192812() {
    super(new long[] {1, -1, 1, -1, 0, -2, 3}, new long[] {3, 1, 1, 3, 3, 5, 7});
  }
}
