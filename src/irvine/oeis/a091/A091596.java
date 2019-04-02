package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091596 Expansion of x(1-2x^2)/(1-x-2x^2)^2.
 * @author Sean A. Irvine
 */
public class A091596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091596() {
    super(new long[] {-4, -4, 3, 2}, new long[] {0, 1, 2, 5});
  }
}
