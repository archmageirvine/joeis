package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099464 Trisection of tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A099464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099464() {
    super(new long[] {1, -5, 7}, new long[] {0, 1, 7});
  }
}
