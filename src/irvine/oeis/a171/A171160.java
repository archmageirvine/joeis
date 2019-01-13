package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171160.
 * @author Sean A. Irvine
 */
public class A171160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171160() {
    super(new long[] {2, 1}, new long[] {3, 4});
  }
}
