package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290186 Expansion of <code>(1+x)/ ((1+x)^3-7*x)</code>.
 * @author Sean A. Irvine
 */
public class A290186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290186() {
    super(new long[] {-1, -3, 4}, new long[] {1, 5, 17});
  }
}
