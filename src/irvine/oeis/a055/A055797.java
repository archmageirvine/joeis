package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055797.
 * @author Sean A. Irvine
 */
public class A055797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055797() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 6, 22, 64, 162, 372, 792, 1584});
  }
}
