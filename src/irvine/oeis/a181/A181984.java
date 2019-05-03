package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181984 INVERT transform of <code>A028310</code>.
 * @author Sean A. Irvine
 */
public class A181984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181984() {
    super(new long[] {1, -2, 3}, new long[] {1, 2, 5});
  }
}
