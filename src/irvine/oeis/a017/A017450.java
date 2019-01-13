package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017450.
 * @author Sean A. Irvine
 */
public class A017450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017450() {
    super(new long[] {1, -3, 3}, new long[] {25, 256, 729});
  }
}
