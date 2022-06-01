package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099463 Bisection of tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A099463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099463() {
    super(new long[] {1, 1, 3}, new long[] {0, 1, 2});
  }
}
