package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174762 x-values in the solution x^2-61*y^2=1.
 * @author Sean A. Irvine
 */
public class A174762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174762() {
    super(1, new long[] {-1, 3532638098L}, new long[] {1, 1766319049});
  }
}
