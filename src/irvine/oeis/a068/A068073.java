package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068073 Period 4 sequence [ 1, 2, 3, 2, ...].
 * @author Sean A. Irvine
 */
public class A068073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068073() {
    super(new long[] {1, -1, 1}, new long[] {1, 2, 3});
  }
}
