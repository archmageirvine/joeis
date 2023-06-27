package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129803 Triangular numbers that are the sum of three consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A129803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129803() {
    super(1, new long[] {1, -15, 15}, new long[] {10, 136, 1891});
  }
}
