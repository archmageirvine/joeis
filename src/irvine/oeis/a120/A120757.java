package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120757 Expansion of x^2*(2+x)/(1-3*x-4*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A120757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120757() {
    super(new long[] {1, 4, 3}, new long[] {0, 2, 7});
  }
}
