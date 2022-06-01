package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195906 A periodic sequence.
 * @author Sean A. Irvine
 */
public class A195906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195906() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {22, 11, 6, 54, 27});
  }
}
