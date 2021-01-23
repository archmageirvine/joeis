package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007202 Crystal ball sequence for hexagonal close-packing.
 * @author Sean A. Irvine
 */
public class A007202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007202() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 13, 57, 153, 323});
  }
}

