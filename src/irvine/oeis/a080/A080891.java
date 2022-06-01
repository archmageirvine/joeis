package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080891 Period 5: repeat [0, 1, -1, -1, 1].
 * @author Sean A. Irvine
 */
public class A080891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080891() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, -1, -1});
  }
}
