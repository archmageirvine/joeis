package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041274.
 * @author Sean A. Irvine
 */
public class A041274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041274() {
    super(new long[] {-1, 0, 98, 0}, new long[] {12, 49, 1188, 4801});
  }
}
