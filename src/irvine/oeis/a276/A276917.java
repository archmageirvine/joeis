package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276917 Numbers obtained by alternatively adding centered pentagonal layers of 5*(2^n-1) and 5*(3^n-1) elements.
 * @author Sean A. Irvine
 */
public class A276917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276917() {
    super(new long[] {-6, 12, -1, -10, 4, 2}, new long[] {1, 6, 16, 31, 71, 106});
  }
}
