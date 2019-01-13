package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171496.
 * @author Sean A. Irvine
 */
public class A171496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171496() {
    super(new long[] {-8, 6}, new long[] {6, 28});
  }
}
