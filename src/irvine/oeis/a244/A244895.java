package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244895 Period 5 sequence <code>[0, 1, 1, -1, -1, </code>...].
 * @author Sean A. Irvine
 */
public class A244895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244895() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, 1, -1});
  }
}
