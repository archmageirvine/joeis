package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218753.
 * @author Sean A. Irvine
 */
public class A218753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218753() {
    super(new long[] {-49, 50}, new long[] {0, 1});
  }
}
