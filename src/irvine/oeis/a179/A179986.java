package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179986.
 * @author Sean A. Irvine
 */
public class A179986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179986() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 19});
  }
}
