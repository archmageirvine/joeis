package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226044 Period of length 8: 1, 64, 16, 64, 4, 64, 16, 64.
 * @author Sean A. Irvine
 */
public class A226044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226044() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 64, 16, 64, 4, 64, 16, 64});
  }
}
