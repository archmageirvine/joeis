package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099450 Expansion of 1/(1 - 5x + 7x^2).
 * @author Sean A. Irvine
 */
public class A099450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099450() {
    super(new long[] {-7, 5}, new long[] {1, 5});
  }
}
