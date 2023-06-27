package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171182 Period 6: repeat [0, 1, 1, 1, 0, 2].
 * @author Sean A. Irvine
 */
public class A171182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171182() {
    super(1, new long[] {1, 1, 0, -1}, new long[] {0, 1, 1, 1});
  }
}
