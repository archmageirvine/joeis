package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288206.
 * @author Sean A. Irvine
 */
public class A288206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288206() {
    super(new long[] {2, -3, -1, 3}, new long[] {2, 4, 8, 18});
  }
}
