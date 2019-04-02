package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141775 Binomial transform of (1, 2, 0, 1, 2, 0, 1, 2, 0, ...).
 * @author Sean A. Irvine
 */
public class A141775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141775() {
    super(new long[] {2, -3, 3}, new long[] {1, 3, 5});
  }
}
