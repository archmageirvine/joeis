package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262862.
 * @author Sean A. Irvine
 */
public class A262862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262862() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 5, 17, 93});
  }
}
