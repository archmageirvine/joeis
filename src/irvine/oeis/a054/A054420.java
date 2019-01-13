package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054420.
 * @author Sean A. Irvine
 */
public class A054420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054420() {
    super(new long[] {5, -3, 7}, new long[] {1, 3, 13});
  }
}
