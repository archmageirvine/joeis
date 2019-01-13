package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178977.
 * @author Sean A. Irvine
 */
public class A178977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178977() {
    super(new long[] {1, -3, 3}, new long[] {5, 20, 44});
  }
}
