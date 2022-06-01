package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100335 An inverse Catalan transform of J(2n).
 * @author Sean A. Irvine
 */
public class A100335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100335() {
    super(new long[] {-4, 8, -9, 5}, new long[] {0, 1, 4, 11});
  }
}
