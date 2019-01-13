package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244975.
 * @author Sean A. Irvine
 */
public class A244975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244975() {
    super(new long[] {7, -15, 9}, new long[] {0, 1, 11});
  }
}
