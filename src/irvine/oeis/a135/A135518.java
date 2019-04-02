package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135518 Generalized repunits in base 15.
 * @author Sean A. Irvine
 */
public class A135518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135518() {
    super(new long[] {-15, 16}, new long[] {1, 16});
  }
}
