package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222408.
 * @author Sean A. Irvine
 */
public class A222408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222408() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 61, 211, 551});
  }
}
