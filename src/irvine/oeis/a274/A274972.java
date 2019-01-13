package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274972.
 * @author Sean A. Irvine
 */
public class A274972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274972() {
    super(new long[] {1, -975, 975}, new long[] {4, 4387, 4273420});
  }
}
