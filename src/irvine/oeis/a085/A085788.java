package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085788.
 * @author Sean A. Irvine
 */
public class A085788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085788() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 27, 72, 150});
  }
}
