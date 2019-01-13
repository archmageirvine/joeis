package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003730.
 * @author Sean A. Irvine
 */
public class A003730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003730() {
    super(new long[] {3, -22, -4, 9}, new long[] {1, 11, 81, 666});
  }
}
