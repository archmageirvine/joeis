package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192980.
 * @author Sean A. Irvine
 */
public class A192980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192980() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 2, 6, 15});
  }
}
