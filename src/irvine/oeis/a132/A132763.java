package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132763.
 * @author Sean A. Irvine
 */
public class A132763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132763() {
    super(new long[] {1, -3, 3}, new long[] {0, 22, 46});
  }
}
