package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144844 a(n) = ((2 + sqrt(2))^n - (2 - sqrt(2))^n)^2/8.
 * @author Sean A. Irvine
 */
public class A144844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144844() {
    super(new long[] {8, -28, 14}, new long[] {0, 1, 16});
  }
}
