package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134396 A007318 * A000125.
 * @author Sean A. Irvine
 */
public class A134396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134396() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 3, 9, 27});
  }
}
