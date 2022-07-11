package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244895 Period 5: repeat [0, 1, 1, -1, -1].
 * @author Sean A. Irvine
 */
public class A244895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244895() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, 1, -1});
  }
}
