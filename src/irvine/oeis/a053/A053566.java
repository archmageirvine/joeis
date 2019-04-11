package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053566 Expansion of <code>(11*x-2)/(1-3*x)^2</code>.
 * @author Sean A. Irvine
 */
public class A053566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053566() {
    super(new long[] {-9, 6}, new long[] {-2, -1});
  }
}
