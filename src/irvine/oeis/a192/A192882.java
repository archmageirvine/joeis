package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192882.
 * @author Sean A. Irvine
 */
public class A192882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192882() {
    super(new long[] {-1, 2, 7, 2}, new long[] {0, 1, 3, 14});
  }
}
