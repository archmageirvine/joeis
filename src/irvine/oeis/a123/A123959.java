package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123959 Expansion of 1/(8*x^5+8*x^4-8*x^3-4*x^2+1).
 * @author Sean A. Irvine
 */
public class A123959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123959() {
    super(new long[] {-8, -8, 8, 4, 0}, new long[] {1, 0, 4, 8, 8});
  }
}
