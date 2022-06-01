package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198699 7*10^n-1.
 * @author Sean A. Irvine
 */
public class A198699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198699() {
    super(new long[] {-10, 11}, new long[] {6, 69});
  }
}
