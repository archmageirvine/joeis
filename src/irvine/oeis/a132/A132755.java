package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132755.
 * @author Sean A. Irvine
 */
public class A132755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132755() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 27});
  }
}
