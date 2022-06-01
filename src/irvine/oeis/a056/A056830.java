package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056830 Alternate digits 1 and 0.
 * @author Sean A. Irvine
 */
public class A056830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056830() {
    super(new long[] {-10, 1, 10}, new long[] {0, 1, 10});
  }
}
