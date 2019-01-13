package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171681.
 * @author Sean A. Irvine
 */
public class A171681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171681() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {1, 6, 54, 857, 15058});
  }
}
