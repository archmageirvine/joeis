package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171640.
 * @author Sean A. Irvine
 */
public class A171640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171640() {
    super(new long[] {1, -11, 11}, new long[] {1, 3, 25});
  }
}
