package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165910 Wiener indices of Fibonacci trees of order k.
 * @author Sean A. Irvine
 */
public class A165910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165910() {
    super(new long[] {1, -3, -5, 14, 10, -14, -3, 5}, new long[] {1, 4, 18, 62, 210, 666, 2063, 6226});
  }
}
