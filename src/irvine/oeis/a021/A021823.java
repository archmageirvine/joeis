package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021823 Decimal expansion of 1/819.
 * @author Sean A. Irvine
 */
public class A021823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021823() {
    super(new long[] {1, -2, 2}, new long[] {0, 0, 1});
  }
}
