package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048332.
 * @author Sean A. Irvine
 */
public class A048332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048332() {
    super(new long[] {-7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 6, 8, 16, 24, 32, 40});
  }
}
