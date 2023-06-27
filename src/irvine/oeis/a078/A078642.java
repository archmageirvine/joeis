package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078642 Numbers with two representations as the sum of two Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A078642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078642() {
    super(1, new long[] {1, 1}, new long[] {4, 6});
  }
}
