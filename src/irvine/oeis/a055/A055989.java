package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055989.
 * @author Sean A. Irvine
 */
public class A055989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055989() {
    super(new long[] {-1, 4, -6, 5}, new long[] {1, 3, 10, 36});
  }
}
