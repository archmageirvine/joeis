package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074872 Inverse BinomialMean transform of the Fibonacci sequence A000045 (with the initial 0 omitted).
 * @author Sean A. Irvine
 */
public class A074872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074872() {
    super(1, new long[] {5, 0}, new long[] {1, 1});
  }
}
