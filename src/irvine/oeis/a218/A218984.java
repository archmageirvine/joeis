package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218984.
 * @author Sean A. Irvine
 */
public class A218984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218984() {
    super(new long[] {-2, -2, 5}, new long[] {4, 17, 75});
  }
}
