package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176373 x-values in the solution to x^2 - 67*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A176373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176373() {
    super(1, new long[] {-1, 97684}, new long[] {1, 48842});
  }
}
