package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036828 A036827/2.
 * @author Sean A. Irvine
 */
public class A036828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036828() {
    super(new long[] {16, -48, 56, -32, 9}, new long[] {0, 1, 17, 125, 637});
  }
}
