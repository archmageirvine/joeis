package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099242 (6n+5)-th terms of expansion of 1/(1 - x - x^6).
 * @author Sean A. Irvine
 */
public class A099242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099242() {
    super(new long[] {-1, 6, -15, 20, -15, 7}, new long[] {1, 7, 34, 153, 686, 3088});
  }
}
