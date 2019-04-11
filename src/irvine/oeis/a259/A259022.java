package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259022 Period 9 sequence <code>[ 1, -1, -1, 1, 0, -1, 1, 1, -1, ...]</code>.
 * @author Sean A. Irvine
 */
public class A259022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259022() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1, -1}, new long[] {1, -1, -1, 1, 0, -1, 1, 1});
  }
}
