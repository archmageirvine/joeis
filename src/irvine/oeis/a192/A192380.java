package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192380.
 * @author Sean A. Irvine
 */
public class A192380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192380() {
    super(new long[] {-1, -2, 6, 2}, new long[] {0, 2, 4, 20});
  }
}
